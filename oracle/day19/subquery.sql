select * from employees
--Neena�� �ٹ��ϴ� �μ� ��ȸ
select department_id
from employees
where first_name = 'Neena'
--Neena�� ���� �μ��� �ٹ��ϴ� ������ ��ȸ
select employee_id, first_name, salary, hire_date, department_id
from employees
where department_id = (
						select department_id
						from employees
						where first_name = 'Neena'
						)
						
--Steven�� �ٹ��ϴ� �μ� ��ȸ
select department_id
from employees
where first_name = 'Steven'
--Steven�� ���� �μ��� �ٹ��ϴ� ������ ��ȸ
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
�������� ���� ��ȸ
select employee_id, first_name
from employees
where employee_id in (
select distinct manager_id
from employees
where manager_id is not null
)
order by employee_id 
				
				
select distinct m.employee_id, m.first_name ������
from employees e, employees m
where e.manager_id = m.employee_id
order by m.employee_id
--, count(e.first_name)
group by m.first_name


�����ڰ� �ƴ� ���� ��ȸ
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


--60�� �μ��� ���� �޿����� ���� �޿��� �ް� �ִ� ���� ��ȸ
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

--60�� �μ��� ���� �޿����� ���� �޿��� �ް� �ִ� ���� ��ȸ
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

