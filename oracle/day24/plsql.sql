sqlplus에서 변수선언하기 
변수값 확인하기 
pl/sql에서 dbms_output.putline()사용하기
serveroutput설정하기 
--------------------------------------------------
employees 테이블을 복사 : person
---------------------------------------------------
1. 특정한 수에 7%의 세금을 계산하는 function생성

create or replace function func_tax(v_num in number)
return number
is
	v_tax number;
begin
	v_tax  := v_num * 0.07;
	--dbms_output.put_line('받은값:'||v_num);
	--dbms_output.put_line('리턴값:'||v_tax);
	return v_tax;
end;
/

select first_name, substr(first_name,1,3),
	   salary, func_tax(salary) 세금, salary*0.07 세금2
	   from employees


2. 특정한 수에 7%의 세금을 계산하는 procedure생성
create or replace procedure sp_tax(v_num in number, v_tax out number)
is
begin
	v_tax  := v_num * 0.07;
	dbms_output.put_line('받은값:'||v_num);
	dbms_output.put_line('아웃값:'||v_tax);
end;
/

3. 특정 고객의 급여를 10% 인상하시오.

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

//입력한 급여보다 작은 사람은 급여 2배로 인상
create or replace procedure sp_salinc2(sal in number)
is
begin
	update emp_backup set salary = salary*2 where employee_id in (select employee_id from emp_backup where salary < sal);
	commit;
end;
/


4. 특정 사원에 대한 salary, start_date를 검색하는 procedure 생성 
   
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
1. 직원아이디를 입력받아서 그 직원의 급여를 
return하는 Function를 생성하시오.
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


2. 부서의 아이디를 입력받아 부서이름을 
return하는 Function를 생성하시오.

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

select employee_id, salary, func_sal(employee_id),department_id, func_dname(department_id) 부서이름
from employees
3. 직원정보를 입력받아 employees테이블에 저장하는 
procedure를 생성하시오 (not null 필드만 허가)
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
	--스칼라변수
	v_count binary_integer :=0;
	v_gender char(1);
	v_salary number(9,2) := 1234567.89;
	v_hiredate date := sysdate +7;
	v_gubun boolean not null := true;
	
	--참조변수
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
	dbms_output.put_line('부서코드='||v_deptrec.department_id);
	dbms_output.put_line('부서명='||v_deptrec.department_name);
	dbms_output.put_line('메니져번호='||v_deptrec.manager_id);
	dbms_output.put_line('로케이션='||v_deptrec.location_id);
end ;
/

create or replace procedure sp_variable()
is
	--스칼라변수(변수타입을 직접 정해줄수 있는 변수)
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
	if (v_count-(v_count*(v_count/2)))=0.5   then dbms_output.put_line('홀수');
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
	
	dbms_output.put_line('입력된 sal '||v_sal);
	dbms_output.put_line('선택된 name '||v_fname);
	dbms_output.put_line('선택된 sal '||v_sal2);
	
	exception
		when no_data_found then dbms_output.put_line('조회된 데이터가 없습니다.');
		when too_many_rows then dbms_output.put_line('조회된 데이터가 많습니다.');
		when others then dbms_output.put_line('오류입니다.');
end ;
/


--묵시적 커서
create or replace procedure sp_empdel
(v_deft in emp_backup.department_id%type)
is
begin
	delete from emp_backup where department_id = v_deft;
	if sql%found then
		dbms_output.put_line('삭제된 row 수:'||sql%rowcount);
	else
		dbms_output.put_line('삭제된 row 없음');
	end if;
end ;
/


select count(*)
from emp_backup
where department_id=30


--a명시적 커서
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
		dbms_output.put_line('아이디 : '||v_id||' 이름 : '||v_fname||' 급여 : '||v_sal||' 입사일 : '||v_date);
		exit when cur_emp%notfound;
	end loop;
	dbms_output.put_line('전체건수:'||cur_emp%rowcount);
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
		dbms_output.put_line('아이디 : '||emp_rec.employee_id||' 이름 : '||emp_rec.first_name||' 급여 : '||emp_rec.salary||' 입사일 : '||emp_rec.hire_date);
	end loop;
	--dbms_output.put_line('전체건수:'||cur_emp%rowcount);
end ;
/





















set serveroutput on