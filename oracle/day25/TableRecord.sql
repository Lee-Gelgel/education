create or replace procedure sp_empall
is
 v_cnt number;
begin
	select count(*)
	into v_cnt
	from employees;
	if v_cnt <=0 then raise no_data_found;
	end if;
	for emplist in (select first_name, salary from employees) loop
	--dbms_output.put_line('조회건수:'||sql%rowcount);
	dbms_output.put_line('직원이름:'||emplist.first_name);
	dbms_output.put_line('직원급여:'||emplist.salary);
	end loop;
	exception
		when no_data_found then
			dbms_output.put_line('data가 없습니다.');
		when others then
			dbms_output.put_line('기타오류코드'||sqlcode);
			dbms_output.put_line('기타오류코드'||sqlerrm);
end ;
/




1. Table type

create or replace procedure sp_empall(v_dept in number)
is
 v_cnt number;
 type empidTBL is table of employees.employee_id%type index by binary_integer;
 type fnameTBL is table of employees.first_name%type index by binary_integer;
 type salTBL is table of employees.salary%type index by binary_integer;
 
 v_arrempid empidTBL;
 v_arrfname fnameTBL;
 v_arrsal salTBL;
 i binary_integer:=0;
begin
	
	select count(*)
	into v_cnt
	from employees
	where department_id = v_dept;
	if v_cnt <=0 then raise no_data_found;
	end if;
	
	--select한 정보를 배열에 저장하기
	for emplist in (select employee_id,first_name, salary from employees where department_id = v_dept) loop
	i := i+1;
	v_arrempid(i) := emplist.employee_id;
	v_arrfname(i) := emplist.first_name;
	v_arrsal(i) := emplist.salary;
	
	end loop;
	
	--출력
	for idx in 1..i loop
	--dbms_output.put_line('조회건수:'||sql%rowcount);
	dbms_output.put_line('직원번호:'||v_arrempid(idx));
	dbms_output.put_line('직원이름:'||v_arrfname(idx));
	dbms_output.put_line('직원급여:'||v_arrsal(idx));
	end loop;

	--exception
	exception
		when no_data_found then
			dbms_output.put_line('data가 없습니다.');
		when others then
			dbms_output.put_line('기타오류코드'||sqlcode);
			dbms_output.put_line('기타오류코드'||sqlerrm);
end ;
/




2. Record type

create or replace procedure sp_emp
is
	type empRec is record (
							v_empid employees.employee_id%type,
							v_fname employees.first_name%type,
							v_salary employees.salary%type);
	v_empRec empRec;
begin
	select employee_id, first_name, salary
	into v_empRec
	from employees
	where employee_id = 100;
	
	dbms_output.put_line('직원번호:'||v_empRec.v_empid);
	dbms_output.put_line('직원이름:'||v_empRec.v_fname);
	dbms_output.put_line('직원급여:'||v_empRec.v_salary);
end ;
/

3. Table of Record type

create or replace procedure sp_emp
is
	type empRec is record (
							v_empid employees.employee_id%type,
							v_fname employees.first_name%type,
							v_salary employees.salary%type);
	v_empRec empRec;
	
	type empRecTBL is table of empRec index by binary_integer;
	
	v_arrRec empRecTBL;
	i binary_integer :=0;
begin
	for emplist in (select employee_id, first_name, salary
				    from employees ) loop
	i := i+1;
	v_arrRec(i) := emplist;
	end loop;
	
	for cnt in 1..i loop
	dbms_output.put_line('직원번호:'||v_arrRec(cnt).v_empid);
	dbms_output.put_line('직원이름:'||v_arrRec(cnt).v_fname);
	dbms_output.put_line('직원급여:'||v_arrRec(cnt).v_salary);
	end loop;
end ;
/
 
