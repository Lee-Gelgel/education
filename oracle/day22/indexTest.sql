Create table empidxtest As select *  from employees;

select *  from empidxtest

select   index_name, table_name,  column_name
From user_ind_columns 
where  table_name = 'EMPIDXTEST';


insert into empidxtest select *  from employees;
insert into empidxtest select *  from employees;

**조회대상 데이터 입력 
insert into empidxtest
(EMPLOYEE_ID,FIRST_NAME,LAST_NAME,EMAIL, hire_date, job_id)
values(1,'aa','b','c', sysdate,'AD_VP');

**인덱스 없을때와 있을때의 시간차이 알아보기 (set timing on) 
Select * from empidxtest where FIRST_NAME='aa';

Create Index idx_empidxtest on empidxtest(FIRST_NAME);

Select * from empidxtest where FIRST_NAME='aa';


**인덱스 정보 조회
select   a.index_name, a.table_name,  b.column_name, 	b.column_position 
from user_indexes a, user_ind_columns b
where a.index_name = b.index_name;



---------------------------------------------------
쿼리문을 사용하는 개발자 입장에서 어떻게 SQL문을 작성할까?

바인드 변수를 사용한다.
가급적 WHERE조건에서는 인덱스 칼럼을 모두 사용한다.
인덱스  칼럼에 사용하는 연산자는 가급적 동등 연산자(=)를 사용한다. 
인덱스 칼럼은 변형하여 사용하지 않도록 한다. 
OR보다는 AND를 사용한다.
그룹핑 쿼리를 사용할 경우 가급적 HAVING보다는 WHERE절에서 데이터를 필터링한다.
DISTINCT는 가급적 사용하지 않는다. – 내부적 정렬작업을 수반
IN,NOT IN 대신에 EXISTS, NOT EXISTS를 사용한다.
SET연산자 사용시 UNION대신 UNION ALL을 사용한다. 


---------------------------------------------------
Finding and Fixing ORA-00054: resource busy and acquire with NOWAIT specified or timeout expired

select a.username, a.sid, a.serial#, b.xidusn, b.process, b.locked_mode, c.object_name, a.sql_id
from v$session a, v$locked_object b, dba_objects c
where a.sid = b.session_id
and b.object_id = c.object_id
order by b.xidusn desc;

alter system kill session 'sid,serial#'