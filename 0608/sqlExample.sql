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