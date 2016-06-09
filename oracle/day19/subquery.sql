select * from employees
--Neena가 근무하는 부서 조회
select department_id
from employees
where first_name = 'Neena'
--Neena와 같은 부서에 근무하는 직원들 조회
select employee_id, first_name, salary, hire_date, department_id
from employees
where department_id = (
						select department_id
						from employees
						where first_name = 'Neena'
						)
						
--Steven이 근무하는 부서 조회
select department_id
from employees
where first_name = 'Steven'
--Steven과 같은 부서에 근무하는 직원들 조회
select employee_id, first_name, salary, hire_date, department_id
from employees
where department_id in (
						select department_id
						from employees
						where first_name = 'Steven'
						)
						
select employee_id, first_name, salary, hire_date, department_id
from employees
where department_id = any (
						select department_id
						from employees
						where first_name = 'Steven'
						)
						
select employee_id, first_name, salary, hire_date, department_id
from employees
where department_id = all (
						select department_id
						from employees
						where first_name = 'Steven'
						)
						
select employee_id, first_name, salary, hire_date, department_id
from employees
where exists (
				select department_id
				from employees
				where first_name = 'Steven'
				)
				
--------------------------------------------------------------------------------------
관리자인 직원 조회
select employee_id, first_name
from employees
where employee_id in (
select distinct manager_id
from employees
where manager_id is not null
)
order by employee_id 
				
				
select distinct m.employee_id, m.first_name 관리자
from employees e, employees m
where e.manager_id = m.employee_id
order by m.employee_id
--, count(e.first_name)
group by m.first_name


관리자가 아닌 직원 조회
select employee_id, first_name
from employees
where employee_id not in (
select distinct manager_id
from employees
where manager_id is not null
)
order by employee_id


select employee_id, first_name
from employees
where employee_id <> all (
select distinct manager_id
from employees
where manager_id is not null
)
order by employee_id 

select distinct e.employee_id, e.first_name
from employees e join employees m on ( e.manager_id = m.employee_id )
where e.employee_id m.employee_id


select count(e.employee_id), count(distinct m.employee_id)
from employees e join employees m on ( e.manager_id = m.employee_id )
where e.employee_id  m.employee_id


--60번 부서의 직원 급여보다 적은 급여를 받고 있는 직원 조회
select employee_id, first_name, salary
from employees
where salary < any(
select salary 
from employees
where department_id = 60
)
order by salary desc

select employee_id, first_name, salary
from employees
where salary < (
select max(salary) 
from employees
where department_id = 60
)
order by salary desc 

--60번 부서의 직원 급여보다 많은 급여를 받고 있는 직원 조회
select employee_id, first_name, salary
from employees
where salary > all(
select salary 
from employees
where department_id = 60
)
order by salary asc

select employee_id, first_name, salary
from employees
where salary > (
select max(salary) 
from employees
where department_id = 60
)
order by salary asc 

