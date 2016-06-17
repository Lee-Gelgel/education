create table emp_black as
(select * from employees where 1=0)

create or replace trigger black_emp
	after delete 
		on emp_backup 
			for each row
declare

begin
	insert into emp_black (employee_id, first_name,last_name,email,hire_date, department_id, job_id, salary)
	values (:old.employee_id,:old.first_name,
			:old.last_name,:old.email,:old.hire_date,:old.department_id,:old.job_id,:old.salary
			);
end ;
/

select * from emp_backup where employee_id=150;
