문제 1. 급여(salary)가 7000인 직원의 이름(first_name), 급여(salary), 부서이름(department_name), 
도시이름(city)을 조회하시오. 단, 부서에 속해있지 않은 직원 정보도 같이 출력되어야 하며 부서가 없는 직원은 부서이름 대신에 
‘<부서없음>’과 도시이름 대신에 ‘<도시없음>’이 출력되도록 한다. (10점)

select *
from departments


select first_name 이름, salary 급여, nvl(department_name,'부서없음') 부서이름, nvl(city,'도시없음') 도시이름
from employees left outer join departments using (department_id)
	           left outer join locations using (location_id)
where salary=7000
order by 1

문제 2. 급여가 7000 이상 8000 이하인 직원들의 이름(first_name), 급여(salary), 부서이름 (department_name), 
해당 직원이 속한 부서의 평균 급여를 출력하시오. 
단, 부서평균은 소수점 이하를 절사(truncate)하여 출력하고 직원 이름순으로 출력해야 한다. (10점)

select first_name 이름, salary 급여, department_name 부서이름, (select trunc(avg(salary),2) 부서평균 
															from employees e 
															where e.department_id=department_id)
from employees join departments using (department_id)
where salary between 7000 and 8000
order by 1

--select first_name 이름, salary 급여, department_name 부서이름, aa.avgsal 부서평균
--from employees join departments using (department_id) 
--			   join (select trunc(avg(salary),2) avgsal 
--					 from employees
--				 	 group by department_id) aa using ()
--where salary between 7000 and 8000
--order by 1

문제 3. 각 부서별 직급별 최대, 최소급여를 조회하되 최대, 최소급여가 같은 부서는 출력결과에서 제외시킨다. 
조회결과는 부서 이름순으로 출력되어야 하며, 부서명이 동일한 경우 최대급여 순으로 정렬하시오. 

select department_name, max(salary) 최대급여, min(salary) 최소급여
from employees join departments using (department_id)
group by department_name
having max(salary)<>min(salary)
order by 1, 2 desc

문제 4. 자신이 속한 부서의 평균 급여보다 급여가 적은 직원들을 대상으로 부서 이름 별 직원 수를 출력하시오. 출력결과는 부서이름을 오름차순 정렬해야 한다. 

select d
from employees e , departments d
--			   ,(select department_id, avg(salary) avgsal
--			   		 from employees
--			   		 group by department_id) emp
where e.department_id = d.department_id


1. 인사관리를 위한 시스템 구축 중 지역(Regions), 국가(Countries), 위치(Locations)에 대한 전체 리스트 정보를 빈번하게 사용할 경우가 생겼다. 
	여러 프로그램에서 매번 반복적으로 사용되며 일부 개발자의 경우 잘못된 조인으로 올바른 결과를 가져오지 못하는 경우가 발생하였다. 
	이를 해결하기 위해 복잡한 질의를 숨기기 위한 논리적 테이블의 용도로 쓰이는 
	DB Object 를 생성하기로 하였다.  
	DB Object 이름은 LOC_DETAILS_{DB OBJECT명} 을 사용한다.
	위 설명에 해당하는 DB Object를 생성하기 위한 스크립트를 작성하라.
	[DB Object 조회 결과 - 화면에 다음과 같은 결과를 출력할 수 있는 DB Object를 생성하라]
select * from departments
select * from employees
select * from Regions
select * from Locations

select * from LOC_DETAILS_view

create or replace view LOC_DETAILS_view
as
select region_id, country_id, l.location_id, r.region_name, 
	   l.street_address, l.postal_code, l.city, c.country_name
from  Locations l join Countries c using(country_id)
			      join Regions r   using(region_id)
order by 2
			  
2. 인사관리를 위하여 현재 직원정보에 대한 백업테이블을 생성하여 보관하기로 합니다. 
	새로 생성하는 백업테이블명은 "EMPLOYEES_BACKUP" 이며 
	기존테이블(EMPLOYEES)의 Index, Constraint는 필요로 하지 않습니다. 
	단 급여(Salary)가 5000을 초과하는 직원만 백업테이블 내에 존재해야 합니다.
	위 설명에 해당하는 테이블을 생성하기 위한 스크립트를 작성하시오. 
	새로 생성한 테이블의 데이터 조회결과는 아래와 같습니다.

select * from EMPLOYEES_BACKUP;

drop table EMPLOYEES_BACKUP

Create table EMPLOYEES_BACKUP 
As 
select *  from employees where salary > 5000

insert into EMPLOYEES_BACKUP values (select *  from employees where salary > 5000)


select   a.index_name, a.table_name,  b.column_name, 	b.column_position 
from user_indexes a, user_ind_columns b
where a.index_name = b.index_name
and a.table_name = 'EMPLOYEES_BACKUP';

select   index_name, table_name,  column_name
From user_ind_columns 
where  table_name = 'EMPLOYEES_BACKUP';

select * from user_constraints where  table_name = 'EMPLOYEES_BACKUP';
select * from user_cons_columns where  table_name = 'EMPLOYEES_BACKUP';

3. 다음 조건을 만족하는 테이블 생성 DDL을 작성하십시오. 
 테이블 명 : TB_PLAYER
 테이블에 대한 이해 : K-리그 선수들의 정보를 가지고 있는 테이블
 칼럼명: player_id	  (선수 고유 ID) 문자 고정자릿수 7자리,
team_id	(팀 고유 ID) 문자 고정자릿수 3자리,
player_name (선수 명) 문자 가변 자릿수 20 자리
nickname (선수 별명) 문자 가변 자릿수 40자리,
join_yyyy(입단년도) 문자 고정 자릿수 4 자리,	
position	(포지션) 문자 고정 자릿수 2자리,
back_no	(등번호) 숫자 2자리,	
nation(국적) 문자 가변 자릿수 20자리,		
birth(생년월일) 날짜
 제약조건 : 기본 키(Primary Key)  player_id (제약 조건명은 PLAYER_ID_PK)
값이 반드시 존재(NOT NULL)  player_id, team_id

create table tb_player(
	player_id char(7) constraint PLAYER_ID_PK primary key,
	team_id char(3) not null,
	player_name varchar2(20),
	nickname varchar2(20),
	join_yyyy char(4),
	position char(2),
	back_no number(2),
	nation varchar2(20),
	birth date
)

select   a.index_name, a.table_name,  b.column_name, 	b.column_position 
from user_indexes a, user_ind_columns b
where a.index_name = b.index_name
and a.table_name = 'TB_PLAYER';

select   index_name, table_name,  column_name
From user_ind_columns 
where  table_name = 'TB_PLAYER';

select * from user_constraints where  table_name = 'TB_PLAYER';
select * from user_cons_columns where  table_name = 'TB_PLAYER';


4. Locations, Countries, Regions 테이블의 정보를 자주 이용해야 하며 이에 대해 하나의 단일 테이블인 것처럼 이용할 수 있도록 하기 위해 
다음과 같이 출력할 수 있는 'LOCATIONS_NOT_AMERICAS'라는 이름의 View를 생성하기로 하였다. 단 REGION_NAME이 Americas 가 아닌 것으로 한정한다. 

select * from LOCATIONS_NOT_AMERICAS

create or replace view LOCATIONS_NOT_AMERICAS
as
select l.location_id, l.street_address, l.postal_code, l.city, c.country_name, r.region_name 
from  Locations l join Countries c using(country_id)
			      join Regions r   using(region_id)
where r.region_name <> initcap('AMERICAS')
order by 2
