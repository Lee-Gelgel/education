--package 선언
create or replace package insaPKG is
		procedure sp_emp(emp in number);
		function func_tax(salary in number) return number;
end insaPKG;
/

--
create or replace package body insaPKG is
		procedure sp_emp(emp in number)
		is
			v_fname varchar2(20);
		begin
			select first_name
			into v_fname
			from employees
			where employee_id = emp;
			dbms_output.put_line('직원이름'||v_fname);
		end sp_emp;
		
		function func_tax(salary in number) return number
		is
			v_tex number;
		begin
			v_tex := salary * 0.01;
			return v_tex;
		end func_tax;
end insaPKG;
/