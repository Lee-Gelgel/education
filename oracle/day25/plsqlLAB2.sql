1. 다음과 같이 조회하고자한다. 부서정보 출력시 부서장과 location이름이 출력되도록 
pl/sql를 작성하시오.

getManagerName(manager_id)를 이용하여 manager의 
fullname(first_name과 last_name)을 출력한다. 
getLocationName(location_id)를 이용하여 LocationName을 출력한다.

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
2. 다음과 같이 수행시 DML이 수행되는 PL/SQL을 작성하시오 
exec sp_empbackup_dml('insert', 333, '브라이언','양','youchan@naver.com',sysdate,'ST_MAN', 6000);                       
exec sp_empbackup_dml('insert', 333, :name,'양','youchan@naver.com',sysdate,'ST_MAN', :sal);                       

exec sp_empbackup_dml('update', 333, '브라이언','양','youchan@naver.com',sysdate,'ST_MAN', 6000);                       
exec sp_empbackup_dml('update', 333, :name,'양','youchan@naver.com',sysdate,'ST_MAN', :sal);                       
exec sp_empbackup_dml('select', 333, null,null,null,null,null, null);
exec sp_empbackup_dml('select', 333, :name,null,null,null,null, :sal);

exec sp_empbackup_dml('delete', 333, null,null,null,null,null, null);   
exec sp_empbackup_dml('delete', 333, :name,null,null,null,null,  :sal);   
select * from jobs where job_id = 'ST_MAN'
select * from emp_backup where employee_id = 333
----파라메터 순서 
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
		 dbms_output.put_line('select 입니다');
	 	 select first_name, salary
	 	 into v_first_name, v_salary
	 	 from emp_backup 
	 	 where employee_id = v_employee_id; 	
		 dbms_output.put_line('이름:'||v_first_name);
		 dbms_output.put_line('급여:'||v_salary);
	  when 'insert' then
	 	 dbms_output.put_line('insert 입니다');
		 insert into emp_backup (employee_id,first_name, last_name, email, hire_date, job_id,salary) 
		 values (v_employee_id, v_first_name, v_last_name, v_email, v_hire_date, v_job_id, v_salary);
	 	 dbms_output.put_line('입력건수:'||sql%rowcount);
	 	 commit;
	  when 'delete' then
	  	 delete from emp_backup where  employee_id = v_employee_id;
	 	 dbms_output.put_line('delete 입니다');
	  when 'update' then
	 	 dbms_output.put_line('update 입니다');
	  	 update emp_backup set 
	  	 first_name	=	v_first_name, 
	  	 last_name	=	v_last_name, 
	  	 email		=	v_email, 
	  	 hire_date	=	v_hire_date, 
	  	 job_id		=	v_job_id, 
	  	 salary		=	v_salary 
	  	 where employee_id=v_employee_id;
	  	 dbms_output.put_line('수정건수:'||sql%rowcount);
	 	 commit;
	 end case;
	 exception
		when no_data_found then dbms_output.put_line('데이터가 존재하지 없습니다.');
		when too_many_rows then dbms_output.put_line('데이터가 너무 많습니다.');
		when others then rollback; dbms_output.put_line('오류코드:'||sqlcode); dbms_output.put_line('오류코드:'||sqlerrm); 
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
3. 인사이동 ...부서이동, 직급이 올라가고 월급도 올라간다. 
exec_emp_transfer(직원번호, 이동부서, 이동직급, 변경sal)
exec exec_emp_transfer(null, null, null, null)
exec exec_emp_transfer(150, 90, 'ST_MAN', 7000)

SELECT FIRST_NAME, EMPLOYEE_ID, DEPARTMENT_ID, jOB_ID FROM EMP_BACKUP WHERE EMPLOYEE_ID = 150;
SELECT 
이동부서가 null이 아니면 department_id를 변경하고자한다.
이동직급이 null이 아니면 job_id를 변경하고자한다.
새로운 직급의 최대 최소급여액을 jobs에서 검색하여
입력한 급여액이 최대급여액보다 크면 exception을 발생시키다. 
(exception타입선언-> salary_too_high exception; 
 exception을 발생-> raise salary_too_high)
입력한 급여액이 최소급여액보다 작으면 exception을 발생시키다. 
(exception타입선언-> salary_too_low exception; 
 exception을 발생-> raise salary_low_high)
 
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
	 --변경가능한 데이터인지? jobs의 최대,최소 sal
	 select Min_salary, Max_salary
	 into v_minsal, v_maxsal
	 from jobs
	 where job_id = v_move_job;
	 
	 --가능데이터가 아니면 오류 일으키기
	 if v_move_sal<v_minsal then
	 raise salary_too_low;
	 end if;
	 if v_move_sal>v_maxsal then
	 raise salary_too_high;
	  end if;
	
	--변경
	update emp_backup
	set department_id = nvl2(v_move_dept,v_move_dept,department_id),
		job_id = nvl2(v_move_job,v_move_job,job_id),
		salary = v_move_sal
	where employee_id = v_employee_id;
	
	exception
		when salary_too_low then
		dbms_output.put_line('최소값보다 낮다');
		when salary_too_high then
		dbms_output.put_line('최대값보다 높다');
		when others then
		dbms_output.put_line('오류코드:'||sqlcode); 
		dbms_output.put_line('오류코드:'||sqlerrm);
 end ;
 /
 
 



 