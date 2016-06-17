1. ������ ���� ��ȸ�ϰ����Ѵ�. �μ����� ��½� �μ���� location�̸��� ��µǵ��� 
pl/sql�� �ۼ��Ͻÿ�.

getManagerName(manager_id)�� �̿��Ͽ� manager�� 
fullname(first_name�� last_name)�� ����Ѵ�. 
getLocationName(location_id)�� �̿��Ͽ� LocationName�� ����Ѵ�.

create or replace function getManagerName(m_id in number)
return varchar2
is
	f_name varchar2(20);
begin
	select first
	into f_name
	from employees
	where employee_id= m_id;
	return f_name;
end ;
/

create or replace function getManagerName
(v_manager_id in number)
return varchar2
is	
	v_name varchar2(45);
begin
	select first_name||last_name
	into v_name
	from employees
	where employee_id = v_manager_id;
	return v_name;
end ;
/

create or replace function getLocationName
(v_location_id in number)
return varchar2
is
	v_name varchar2(30);
begin
	select city
	into v_name
	from locations
	where location_id = v_location_id;
	return v_name;
end;
/
select getManagerName(100) from dual

select department_id, department_name, 
     getManagerName(manager_id),
     getLocationName(location_id)
from departments

select * from departments

-----------------------------------------------------------------------
2. ������ ���� ����� DML�� ����Ǵ� PL/SQL�� �ۼ��Ͻÿ� 
exec sp_empbackup_dml('insert', 333, '����̾�','��','youchan@naver.com',sysdate,'ST_MAN', 6000);                       
exec sp_empbackup_dml('insert', 333, :name,'��','youchan@naver.com',sysdate,'ST_MAN', :sal);                       

exec sp_empbackup_dml('update', 333, '����̾�','��','youchan@naver.com',sysdate,'ST_MAN', 6000);                       
exec sp_empbackup_dml('update', 333, :name,'��','youchan@naver.com',sysdate,'ST_MAN', :sal);                       
exec sp_empbackup_dml('select', 333, null,null,null,null,null, null);
exec sp_empbackup_dml('select', 333, :name,null,null,null,null, :sal);

exec sp_empbackup_dml('delete', 333, null,null,null,null,null, null);   
exec sp_empbackup_dml('delete', 333, :name,null,null,null,null,  :sal);   
select * from jobs where job_id = 'ST_MAN'
select * from emp_backup where employee_id = 333
----�Ķ���� ���� 
employees
 (select|insert|delete|update)
 EMPLOYEE_ID
 FIRST_NAME
 LAST_NAME
 EMAIL
 HIRE_DATE
 JOB_ID
 SALARY
 
create or replace procedure sp_empbackup_dml
(v_dml         in char,
 v_employee_id in 		employees.EMPLOYEE_ID%type, 
 v_first_name  in out   employees.FIRST_NAME%type,
 v_last_name   in		employees.LAST_NAME%type, 
 v_email       in		employees.EMAIL%type,
 v_hire_date   in		employees.HIRE_DATE%type, 
 v_job_id      in		employees.JOB_ID%type,
 v_salary      in out   employees.SALARY%type) 
 is
 begin
	case v_dml 
	 when 'select' then
		 dbms_output.put_line('select �Դϴ�');
	 	 select first_name, salary
	 	 into v_first_name, v_salary
	 	 from emp_backup 
	 	 where employee_id = v_employee_id; 	
		 dbms_output.put_line('�̸�:'||v_first_name);
		 dbms_output.put_line('�޿�:'||v_salary);
	  when 'insert' then
	 	 dbms_output.put_line('insert �Դϴ�');
		 insert into emp_backup (employee_id,first_name, last_name, email, hire_date, job_id,salary) 
		 values (v_employee_id, v_first_name, v_last_name, v_email, v_hire_date, v_job_id, v_salary);
	 	 dbms_output.put_line('�Է°Ǽ�:'||sql%rowcount);
	 	 commit;
	  when 'delete' then
	  	 delete from emp_backup where  employee_id = v_employee_id;
	 	 dbms_output.put_line('delete �Դϴ�');
	  when 'update' then
	 	 dbms_output.put_line('update �Դϴ�');
	  	 update emp_backup set 
	  	 first_name	=	v_first_name, 
	  	 last_name	=	v_last_name, 
	  	 email		=	v_email, 
	  	 hire_date	=	v_hire_date, 
	  	 job_id		=	v_job_id, 
	  	 salary		=	v_salary 
	  	 where employee_id=v_employee_id;
	  	 dbms_output.put_line('�����Ǽ�:'||sql%rowcount);
	 	 commit;
	 end case;
	 exception
		when no_data_found then dbms_output.put_line('�����Ͱ� �������� �����ϴ�.');
		when too_many_rows then dbms_output.put_line('�����Ͱ� �ʹ� �����ϴ�.');
		when others then rollback; dbms_output.put_line('�����ڵ�:'||sqlcode); dbms_output.put_line('�����ڵ�:'||sqlerrm); 
 end ;
/
select * from emp_backup
		--insert
	when 'insert' then 
	insert into emp_backup (employee_id,first_name, last_name, email, hire_date, job_id,salary) 
	values (v_employee_id, v_first_name, v_last_name, v_email, v_hire_date, v_job_id, v_salary);
	--update
	when 'update' then 
	update emp_backup set first_name=v_first_name, last_name=v_last_name, email=v_email, hire_date=v_hire_date,
	job_id=v_job_id, salary=v_salary where employee_id=v_employee_id;
	--select
	when 'select' then 
	select * from emp_backup where employee_id = v_employee_id;
	--delect
	when 'delete' then 
	delete from emp_backup where  employee_id = v_employee_id;
	 
	 
--------------------------------------------------
3. �λ��̵� ...�μ��̵�, ������ �ö󰡰� ���޵� �ö󰣴�. 
exec_emp_transfer(������ȣ, �̵��μ�, �̵�����, ����sal)
exec exec_emp_transfer(null, null, null, null)
exec exec_emp_transfer(150, 90, 'ST_MAN', 7000)

SELECT FIRST_NAME, EMPLOYEE_ID, DEPARTMENT_ID, jOB_ID FROM EMP_BACKUP WHERE EMPLOYEE_ID = 150;
SELECT 
�̵��μ��� null�� �ƴϸ� department_id�� �����ϰ����Ѵ�.
�̵������� null�� �ƴϸ� job_id�� �����ϰ����Ѵ�.
���ο� ������ �ִ� �ּұ޿����� jobs���� �˻��Ͽ�
�Է��� �޿����� �ִ�޿��׺��� ũ�� exception�� �߻���Ű��. 
(exceptionŸ�Լ���-> salary_too_high exception; 
 exception�� �߻�-> raise salary_too_high)
�Է��� �޿����� �ּұ޿��׺��� ������ exception�� �߻���Ű��. 
(exceptionŸ�Լ���-> salary_too_low exception; 
 exception�� �߻�-> raise salary_low_high)
 
 create or replace procedure exec_emp_transfer
 (v_employee_id in emp_backup.employee_id%type,
  v_move_dept in emp_backup.department_id%type,
  v_move_job in emp_backup.job_id%type,
  v_move_sal in emp_backup.salary%type)
 is
 	v_minsal emp_backup.salary%type;
 	v_maxsal emp_backup.salary%type;
 	salary_too_high exception;
 	salary_too_low exception;
 begin
	 --���氡���� ����������? jobs�� �ִ�,�ּ� sal
	 select Min_salary, Max_salary
	 into v_minsal, v_maxsal
	 from jobs
	 where job_id = v_move_job;
	 
	 --���ɵ����Ͱ� �ƴϸ� ���� ����Ű��
	 if v_move_sal<v_minsal then
	 raise salary_too_low;
	 end if;
	 if v_move_sal>v_maxsal then
	 raise salary_too_high;
	  end if;
	
	--����
	update emp_backup
	set department_id = nvl2(v_move_dept,v_move_dept,department_id),
		job_id = nvl2(v_move_job,v_move_job,job_id),
		salary = v_move_sal
	where employee_id = v_employee_id;
	
	exception
		when salary_too_low then
		dbms_output.put_line('�ּҰ����� ����');
		when salary_too_high then
		dbms_output.put_line('�ִ밪���� ����');
		when others then
		dbms_output.put_line('�����ڵ�:'||sqlcode); 
		dbms_output.put_line('�����ڵ�:'||sqlerrm);
 end ;
 /
 
 



 