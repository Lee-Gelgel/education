sqlplus���� ���������ϱ� 
������ Ȯ���ϱ� 
pl/sql���� dbms_output.putline()����ϱ�
serveroutput�����ϱ� 
--------------------------------------------------
employees ���̺��� ���� : person
---------------------------------------------------
1. Ư���� ���� 7%�� ������ ����ϴ� function����

create or replace function func_tax(v_num in number)
return number
is
	v_tax number;
begin
	v_tax  := v_num * 0.07;
	--dbms_output.put_line('������:'||v_num);
	--dbms_output.put_line('���ϰ�:'||v_tax);
	return v_tax;
end;
/

select first_name, substr(first_name,1,3),
	   salary, func_tax(salary) ����, salary*0.07 ����2
	   from employees


2. Ư���� ���� 7%�� ������ ����ϴ� procedure����
create or replace procedure sp_tax(v_num in number, v_tax out number)
is
begin
	v_tax  := v_num * 0.07;
	dbms_output.put_line('������:'||v_num);
	dbms_output.put_line('�ƿ���:'||v_tax);
end;
/

3. Ư�� ���� �޿��� 10% �λ��Ͻÿ�.

create table emp_backup as
select * from employees

select * from emp_backup

create or replace procedure sp_salinc(empid in number)
is
begin
	update emp_backup set salary = salary*1.1 where employee_id = empid;
	commit;
end;
/

select * from emp_backup where salary < 5000

//�Է��� �޿����� ���� ����� �޿� 2��� �λ�
create or replace procedure sp_salinc2(sal in number)
is
begin
	update emp_backup set salary = salary*2 where employee_id in (select employee_id from emp_backup where salary < sal);
	commit;
end;
/


4. Ư�� ����� ���� salary, start_date�� �˻��ϴ� procedure ���� 
   
   create or replace procedure sp_search
   (v_empid in number, v_salary out number, v_start_date out varchar2)
	is
	begin
		select salary, to_char(hire_date,'yyyy/mm/dd')
		into v_salary, v_start_date
		from employees
		where employee_id = v_empid;
	end; 
	/
	
	create or replace procedure sp_search2
   (v_empid in number, v_salary out number, v_start_date out varchar2)
	is
	begin
		select salary, hire_date
		into v_salary, v_start_date
		from employees
		where employee_id = v_empid;
	end; 
	/


---------------------------------------------------
LAB
1. �������̵� �Է¹޾Ƽ� �� ������ �޿��� 
return�ϴ� Function�� �����Ͻÿ�.
create or replace function func_sal(v_empid in number)
return number
is 
	v_sal number;
begin
	select salary
	into v_sal
	from employees 
	where employee_id = v_empid;
	return v_sal;
end;
/


2. �μ��� ���̵� �Է¹޾� �μ��̸��� 
return�ϴ� Function�� �����Ͻÿ�.

create or replace function func_dname(v_did in number)
return varchar2
is
	v_dname varchar2(20);
begin
	select department_name
	into v_dname
	from departments
	where department_id = v_did;
	return v_dname;
end ;
/

select employee_id, salary, func_sal(employee_id),department_id, func_dname(department_id) �μ��̸�
from employees
3. ���������� �Է¹޾� employees���̺� �����ϴ� 
procedure�� �����Ͻÿ� (not null �ʵ常 �㰡)
employee_id, last_name, email, hire_date, job_id

create or replace procedure sp_insertemp
(i_id in number, i_name in varchar2, i_mail in varchar2, i_date in date, i_job in varchar2)
is
begin
	insert into emp_backup (employee_id, last_name, email, hire_date, job_id) 
	values (i_id,i_name,i_mail,i_date,i_job);
end ;
/
select * from emp_backup where employee_id = 99

create or replace procedure sp_variable(v_id in employees.employee_id%type, v_name out employees.first_name%type )
is
	--��Į�󺯼�
	v_count binary_integer :=0;
	v_gender char(1);
	v_salary number(9,2) := 1234567.89;
	v_hiredate date := sysdate +7;
	v_gubun boolean not null := true;
	
	--��������
	v_lastname employees.last_name%type;
	v_deptrec departments%rowtype;
begin
	
	select first_name, last_name
	into v_name, v_lastname
	from employees
	where employee_id = v_id;
	
	v_gender := 'M';
	dbms_output.put_line('v_count='||v_count);
	dbms_output.put_line('v_gender='||v_gender);
	dbms_output.put_line('v_salary='||v_salary);
	dbms_output.put_line('v_hiredate='||v_hiredate);
	if v_gubun then 
	dbms_output.put_line('v_gubun=');
	end if;
	dbms_output.put_line('v_name='||v_name);
	dbms_output.put_line('v_lastname='||v_lastname);
	
	select *
	into v_deptrec
	from departments
	where department_id = 10;
	dbms_output.put_line('�μ��ڵ�='||v_deptrec.department_id);
	dbms_output.put_line('�μ���='||v_deptrec.department_name);
	dbms_output.put_line('�޴�����ȣ='||v_deptrec.manager_id);
	dbms_output.put_line('�����̼�='||v_deptrec.location_id);
end ;
/

create or replace procedure sp_variable()
is
	--��Į�󺯼�(����Ÿ���� ���� �����ټ� �ִ� ����)
	v_count binary_integer :=0;
	v_gender char(1);
	v_salary number(9,2) :=0;
	v_hiredate date := sysdate +7;
	v_gubun boolean not null := true;
begin
	dbms_output.put_line('v_count='||v_count);
	--dbms_output.put_line('v_gender='||v_gender);
end ;
/

create or replace procedure sp_star
is
	v_count number(2) :=1;
	v_satr varchar2(10) :=null;
begin
	loop
		v_satr := v_satr||'*';
		dbms_output.put_line(v_satr);
		v_count := v_count+1;
		exit when v_count>10;
	end loop;
end;
/

create or replace procedure sp_star3
is
	v_count number(2) :=1;
	v_satr varchar2(10) :=null;
begin
	for v_count in 1..10 loop
	if (v_count-(v_count*(v_count/2)))=0.5   then dbms_output.put_line('Ȧ��');
	end if;
	v_satr := v_satr||'*';
	dbms_output.put_line(v_count||v_satr);
	
	end loop;
end;
/

create or replace procedure sp_gugudan
is
	v_num1 number(2);
	v_num2 number(2);
begin
	for v_num1 in 2..9 loop
		for v_num2 in 1..9 loop
	dbms_output.put_line(v_num1||'X'||v_num2||'='||v_num1*v_num2);
		end loop;
		v_num2 := 1;
	end loop;
end;
/

create or replace procedure sp_empsal
(v_sal in employees.salary%type)
is
	v_fname employees.first_name%type;
	v_sal2 employees.salary%type;
begin
	select first_name, salary
	into v_fname,v_sal2
	from employees
	where salary = v_sal;
	
	dbms_output.put_line('�Էµ� sal '||v_sal);
	dbms_output.put_line('���õ� name '||v_fname);
	dbms_output.put_line('���õ� sal '||v_sal2);
	
	exception
		when no_data_found then dbms_output.put_line('��ȸ�� �����Ͱ� �����ϴ�.');
		when too_many_rows then dbms_output.put_line('��ȸ�� �����Ͱ� �����ϴ�.');
		when others then dbms_output.put_line('�����Դϴ�.');
end ;
/


--������ Ŀ��
create or replace procedure sp_empdel
(v_deft in emp_backup.department_id%type)
is
begin
	delete from emp_backup where department_id = v_deft;
	if sql%found then
		dbms_output.put_line('������ row ��:'||sql%rowcount);
	else
		dbms_output.put_line('������ row ����');
	end if;
end ;
/


select count(*)
from emp_backup
where department_id=30


--a����� Ŀ��
create or replace procedure sp_selectall
is
	cursor cur_emp
	is
	select employee_id, first_name, salary, hire_date
	from employees
	where department_id	= 30;
	
	v_id employees.employee_id%type;
	v_fname employees.first_name%type;
	v_sal employees.salary%type;
	v_date employees.hire_date%type;
begin
	open cur_emp;
	loop
		fetch cur_emp into v_id,v_fname,v_sal,v_date;
		dbms_output.put_line('���̵� : '||v_id||' �̸� : '||v_fname||' �޿� : '||v_sal||' �Ի��� : '||v_date);
		exit when cur_emp%notfound;
	end loop;
	dbms_output.put_line('��ü�Ǽ�:'||cur_emp%rowcount);
	close cur_emp;
end ;
/


create or replace procedure sp_selectall
is
	cursor cur_emp
	is
	select employee_id, first_name, salary, hire_date
	from employees
	where department_id	= 30;
	
begin
	for emp_rec in cur_emp loop
		dbms_output.put_line('���̵� : '||emp_rec.employee_id||' �̸� : '||emp_rec.first_name||' �޿� : '||emp_rec.salary||' �Ի��� : '||emp_rec.hire_date);
	end loop;
	--dbms_output.put_line('��ü�Ǽ�:'||cur_emp%rowcount);
end ;
/





















set serveroutput on