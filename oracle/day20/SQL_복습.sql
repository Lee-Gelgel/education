특정행 검색 예제
(1) 특정 값보다 작은 값 검색
	Select first_name, salary from employees 
     where salary < 3000;
(2) 두 값보다 모두 큰 값 검색 (최대값보다 크다)
	Select first_name, salary from employees 
     where salary > ALL(5000,10000);
     
     Select first_name, salary from employees 
     where salary > 5000 and salary > 10000;
(3) 어느 한 값보다 큰 값 검색 (최소값보다 크다)

	Select first_name, salary from employees 
     where salary > ANY(5000,10000);
     
	Select first_name, salary from employees 
     where salary > 5000 or salary > 10000;
     
     

(4) Between~AND~
	Select * from employees
     where salary between 800 and 1000;

	Select * from employees
     where salary>=800 and salary <=1000;
(5) IN
	 Select * from employees
      where department_id in (10,30);

      Select * from employees
      where department_id = 10 or department_id = 30

(6) LIKE
	where first_name like 'S%'
=================
일반함수 예제
select * from s_emp
(1) s_emp 테이블에서 사원의 이름,직책,커미션을 출력하시오.
     이때 커미션이 없는 사원은 3%의 커미션을 적용한다. 
	select name 이름, title 직책, nvl(commission_pct,3) 커미션
	from s_emp
     
	 
(2) s_emp 테이블에서 사원의 이름,직책,커미션을 출력하시오.
     이때 커미션이 있는 사원은 5% , 커미션이 없는 사원은 3%의 커미션을 적용한다. 
     select name 이름, title 직책, nvl2(commission_pct,5,3) 커미션
	from s_emp 
	 
(3) s_emp 테이블에서 mailid가 a로 시작하는 직원의 이름,메일을 검색하시오.
	select name 이름, mailid 메일
	from s_emp
	where mailid like 'a%'
	 
(4) s_emp 테이블에서 커미션이 있으면 커미션을 커미션이 없으면 해당 급여를 , 모두 없으면 100을 출력하시오.
	select name 이름,commission_pct 커미션,salary 급여, COALESCE(commission_pct,salary,100) 결과
	from s_emp
	
	select commission_pct,salary
	from s_emp
	where commission_pct is null and salary is null

	 
(5) 부서번호가 20이면  마켓팅, 30이면 구매팀, 40이면 hr팀 그렇지않으면 부서없음을 출려하시오 
	select * from s_EMP 
	select name, dept_id,decode(dept_id,110,'마케팅',111,'구매팀',112,'hr팀','부서없음')
	from s_emp
	 	
(6) S_EMP 테이블에서 직책이 부장이면 급여의 10%, 과장이면 7%, 사원이면 5%의 급여를 인상하려고 한다. DECODE와 CASE문을 이용하여 급여가 많은 사람부터 출력하시오.
	select name,title, decode(
								case when title like '%부장' then '부장'
									 when title like '%과장' then '과장 '
									 when title like '%사원' then '사원 '
												end
												, '부장' , salary*1.1
												, '과장' , salary*1.07
												, '사원' , salary*1.05
												, salary ) 급여
	from s_emp
	order by 3 desc
	

(7) S_EMP 테이블에서 급여가 400만원 이상이면 A등급, 300만원 이상이면 B등급, 200만원 이상이면 C등급, 100만원 이상이면 D등급, 100만원 미만이면 E등급으로 나타내시오 
	select name, salary, case when salary >= 400 then 'A등급' 
							  when salary >= 300 then 'B등급'
							  when salary >= 200 then 'C등급'
							  when salary >= 100 then 'D등급'
							  else '등급'
						 end 등급
	from s_emp
	 
(8) S_EMP 테이블에서 전체 사원에 대하여 부서번호,이름,급여, 해당 부서내 사원의 급여 순위를 출력하시오.

SELECT DEPT_ID, NAME, SALARY,
        RANK() OVER(PARTITION BY DEPT_ID ORDER BY SALARY DESC)
FROM S_EMP;

	
==========================
GROUP BY절 
(1) 부서별 평균 급여 조회하기
	 select dept_id, avg(salary)
	 from s_emp
	 group by dept_id

(2) 직책이 사원인 직원에 대해 부서별 평균 급여 조회하기
	select dept_id,avg(salary)
	from s_emp
	where title = '사원'
	group by dept_id
	
	select d.name, avg(e.salary)
	from s_emp e join s_dept d on ( e.dept_id=d.id)
	where e.title = '사원'
	group by d.name
	
	

(3) 부서별 평균 급여 조회하기. 단,평균급여가 2000이상만.
	select d.name, avg(e.salary)
	from s_emp e join s_dept d on ( e.dept_id=d.id)
	group by d.name
	having avg(e.salary) >= 2000
	 

(4) 부서별 직급별 급여합계 조회하기 단, 소계값 함께 출력
	select d.name, e.title, sum(e.salary) "부서별 급여합계"
	from s_emp e join s_dept d on ( e.dept_id=d.id)
	group by rollup(d.name, e.title)
	order by 1,2
	
	select sum(salary)
	from s_emp
	
	select nvl(d.name,'합계') 부서별 , nvl(e.title,'소계') 직급별, sum(e.salary) "부서별 급여합계"
	from s_emp e join s_dept d on ( e.dept_id=d.id)
	group by cube(d.name, e.title)
	order by 1
      
(5) 부서별 급여합계 조회하기 단, 소계값 함께 출력
  


======================================
SubQuery 

1.전체 사원들 중에 평균 급여보다 낮은 급여를 받는 사원의 명단을 조회하시오.
select e1.first_name 이름, e1.department_id 부서번호, e1.salary 급여, round(e2.avgsal,1) 평균급여
from employees e1 join (select department_id, avg(salary) avgsal
					 from employees
					 group by department_id) e2 on (e1.department_id = e2.department_id)	
where e1.salary < e2.avgsal
			

2.급여를 가장 많이 받은 직원의 정보를 조회하시오
select e1.first_name 이름, e1.salary 급여
from employees e1, (select max(salary) maxsal from employees) e2
where e1.salary = e2.maxsal

3.Country_id가 ‘US’인 부서들의 정보를 조회하시오.
select * from departments
select * from locations

select d.*,l.country_id
from departments d join (select location_id, country_id
				   		 from locations
						 where country_id='US') l 
				   on (d.location_id = l.location_id)

4.30번 부서의 사원들 중 아무나 한명의 월급보다 많이 받는 사원을 조회하시오. ( >ANY : 최소보다 크다의 의미)

select *
from employees 
where salary > any (select salary
					from employees
					where department_id=30)

select min(salary)
from employees
where department_id=30

select *
from employees
where salary > 2500

5.30번 부서의 사원들 모두의 월급보다 많이 받는 사원을 조회하시오. ( >ALL : 최대보다 크다의 의미) 


select *
from employees 
where salary > all (select salary
					from employees
					where department_id=30)
					
select max(salary)
from employees
where department_id=30

select *
from employees
where salary > 11000

6.30번 부서의 사원들과 같은 월급을 받는 사원을 조회하시오. ( =ANY: IN과 같은 의미) 
select *
from employees 
where salary = any (select salary
					from employees
					where department_id=30)
					
select salary
from employees
where department_id=30
11000/3
3100/4
2900/3
2800/4
2600/4
2500/6
select *
from employees
where salary = 2500


7.부서별 최소 급여를 받는 직원의 정보를 조회하시오
select e1.first_name,e1.department_id, e1.salary
from employees e1 join (select department_id, min(salary) minsal
					from employees
					group by department_id) e2 on (e1.department_id = e2.department_id)
where e1.salary = e2.minsal
order by 2

select * from employees where department_id=20 and salary=6000

8.본인이 받는 급여가 본인이 속한 부서의 평균 급여보다 적은 급여를 받는 직원의 이름, 부서번호, 급여를 조회하시오.

select e1.first_name,e1.department_id, e1.salary, e2.avgsal
from employees e1 join (select department_id, avg(salary) avgsal
					from employees
					group by department_id) e2 on (e1.department_id = e2.department_id)
where e1.salary < e2.avgsal

9.평균 급여보다 높고 최대 급여보다 낮은 원급을 받는 사원들을 조회하시오
select e1.first_name,e1.department_id, e1.salary, e2.avgsal,e2.maxsal
from employees e1, (select avg(salary) avgsal, max(salary) maxsal
					from employees) e2
where salary between e2.avgsal and e2.maxsal

========================================
========================================
N-TOP
select *
from (
select rownum rank, aa, employee_id, first_name, salary
from (
		select rownum aa, employee_id, first_name, salary
		from employees
		order by salary desc )
		where rownum <=5 )
where rank between 4 and 5





1. 급여를 가장 많이 받는 상위 5명의 직원 정보를 조회하시오.
	select rownum rank, e.*
	from	(
			select *
			from employees
			order by salary desc
			) e
	where rownum <=5
	
	select *
	from 	(
			select rownum rank, e.*
			from (
					select *
					from employees
					order by salary desc
					) e
			where rownum <=5	
			)
	where rank between 2 and 3
	

2. 커미션을 가장 많이 받는 상위 3명의 직원 정보를 조회하시오.
select rownum rank, e.*
from	(
		select *
		from employees
		order by commission_pct desc nulls last
		) e
where rownum <=3

select *
from	(
		select rownum rank, e.*
		from	(
				select *
				from employees
				order by commission_pct desc nulls last
				) e
		where rownum <=3
		)
where rank between 2 and 3


3. 월별 입사자 수를 조회하되, 입사자 수가 5명 이상인 월만 출력하시오.

select (to_char(hire_date,'mm')) 월별, count(to_char(hire_date,'mm')) "입사자 수"
from employees
group by (to_char(hire_date,'mm'))
order by 월별

select (to_char(hire_date,'mm'))||'월' 월별, count(to_char(hire_date,'mm')) "입사자 수"
from employees
group by rollup( (to_char(hire_date,'mm')))
having count(to_char(hire_date,'mm'))>=5
order by 월별


4. 년도별 입사자 수를 조회하시오. 
단, 입사자수가 많은 년도부터 출력되도록 합니다.
select *
from 	(
		select rownum rank, e.*
			from (
				select (to_char(hire_date,'yyyy'))||'년 '||count(to_char(hire_date,'yyyy'))||'명' "년도별 입사자수"
				from employees
				group by (to_char(hire_date,'yyyy'))
				order by count(to_char(hire_date,'yyyy')) desc ) e
		)
where rank between 3 and 5
		



 