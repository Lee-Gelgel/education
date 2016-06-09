sql_lab2(단일행 함수)
7. 각 부서별 인원수를 조회하되 인원수가 5명 이상인 부서만 출력되도록 하시오.
select * from departments

select d.department_name, count(*) 
from departments d, employees e
where d.department_id = e.department_id
group by d.department_name
having count(*) >= 5
order by count(*) desc

select department_id, count(*)
from employees
group by department_id
having count(*) >= 5
order by count(*) desc
order by department_id

8. 각 부서별 최대급여와 최소급여를 조회하시오.
   단, 최대급여와 최소급여가 같은 부서는 직원이 한명일 가능성이 높기때문에 
   조회결과에서 제외시킨다.

select d.department_name, max(e.salary), min(salary)
from employees e join departments d on (e.department_id = d.department_id)
group by department_name
having max(e.salary) <> min(e.salary)
order by department_name asc
   
   
select department_id, max(salary), min(salary)
from employees
group by department_id
having max(salary) <> min(salary)

   
9. 부서가 50, 80, 110 번인 직원들 중에서 급여를 5000 이상 24000 이하를 받는
   직원들을 대상으로 부서별 평균 급여를 조회하시오.
   다, 평균급여가 8000 이상인 부서만 출력되어야 하며, 출력결과를 평균급여가 높은
   부서면저 출력되도록 해야 한다.

select d.department_name, avg(e.salary)
from employees e join departments d using(department_id)
where department_id in (50,80,110) and e.salary between 5000 and 24000
group by d.department_name
having avg(e.salary) >= 8000
order by avg(e.salary) desc

   
select department_id, avg(salary)
from employees
where department_id in (50,80,110) and salary between 5000 and 24000
group by department_id
having avg(salary) >= 8000
order by avg(salary) desc

----------------------------------------------------------------------------------
select * from employees
select 
		count(employee_id) 직원건수,
		count(*) 직원건수2,
		count(department_id) 직원건수3,
		count(nvl(commission_pct,0)) 직원건수4,
		count(distinct nvl(department_id,999)) 직원건수4
from employees

select min(hire_date), max(hire_date)
from employees







----------------------------------------------------------------------------------
*************************************************************************************
*************************************************************************************
*************************************************************************************
*************************************************************************************
select * from employees
select * from jobs
select e.first_name, d.department_name, j.job_title
from employees e join departments d using (department_id)
				join jobs j on (e.job_id = j.job_id)
				
join using, join on 결합해서 사용가능한데
join using 에서 공통컬럼으로 결합한 컬럼을 또 다른 테이블과 join on(별명.컬럼 = 별멍.컬럼) 으로 조인 가능한지 테스트해볼것
어느경우에 이렇게 사용가능할지.
셀프조인?
공통컬럼으로 묶인 컬럼, 셀프조인 컬럼 테스트해볼것
*************************************************************************************
*************************************************************************************
*************************************************************************************
*************************************************************************************
----------------------------------------------------------------------------------



----------------------------------------------------------------------------------
----------------------------------------------------------------------------------