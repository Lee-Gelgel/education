select 
		departments.department_id, 
		departments.department_name,
		departments.manager_id,
		employees.first_name
from 
		departments,
		employees
where 
		departments.manager_id 
		= employees.employee_id
		
		
		
		
select 
		employees.first_name,
		employees.department_id,
		departments.department_id,
		departments.department_name
from 
		employees,
		departments
where 
		departments.department_id
		=employees.department_id
		
		
select 
		e.first_name,
		e.department_id,
		d.department_id,
		d.department_name
from 
		employees e,
		departments d
where 
		d.manager_id
		=e.employee_id
		
		
		
---------------------------------------
--ansi join using
select 
		e.first_name,
		department_id,
		d.department_name
from
		employees e
		join departments d
			 using (department_id)
where
		e.employee_id>0
		
---------------------------------------
select e.ename, d.dname
from emp e 
		join dept d  using (deptno)
order by e.ename asc
---------------------------------------
		
		
		
select 
		e.first_name,
		e.department_id,
		d.department_id,
		d.department_name
from
		employees e
		join departments d on (e.department_id =d.department_id)
		

		
		
		
select 
		e.first_name,
		e.department_id,
		d.department_id,
		d.department_name
from 
		employees e 
		join departments d
		on(d.manager_id = e.employee_id)
where e.employee_id > 0
order by 1



---------------------------------------------------------------------
select	e.first_name, e.salary, j.job_title ,j.min_salary, j.max_salary
from	jobs j , employees e
where e.salary between j.min_salary and j.max_salary
order by e.first_name
---------------------------------------------------------------------

