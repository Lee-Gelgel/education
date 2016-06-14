다음조건을 만족하는 테이블을 생성하시오.
1. table이름 : constraint_dept
   column이름:
  	deptid 숫자3자리 기본키
  	deptname 가변문자20자리 null을 허용하지않는다.

create table constraint_dept(
	deptid number(3) constraint dept_pk primary key,
	deptname varchar2(20) not null
)
insert into constraint_dept(deptid, deptname) values(100,'개발부');
insert into constraint_dept(deptid, deptname) values(200,'영업부');
insert into constraint_dept(deptid, deptname) values(300,'총무부');
insert into constraint_dept(deptid, deptname) values(400,'인사부');  	
2.table이름 : constraint_job 
   column이름:
  	jobid 문자3자리 기본키
  	jobname 가변문자20자리 null을 허용하지않는다.
  	
create table constraint_job (
	jobid char(3) constraint job_pk primary key,
	jobname varchar2(20) not null
)
insert into constraint_job(jobid, jobname) values('MGR','Manager');
insert into constraint_job(jobid, jobname) values('INT','Intern');
insert into constraint_job(jobid, jobname) values('STF','사원');

3.table이름 : constraint_emp
	column이름:
	 empid 고정문자3자리 기본키
	 empname 가변문자20자리 null을 허용하지않는다.
	 email 가변문자25자리 유일한값을 가진다.
	 phone 가변문자12자리 null을 허용한다.
	 hire_date 날짜타입 입력하지않은 경우 시스템날짜가 default로 입력된다.
	 salary 숫자9자리 null을 허용한다.
	 gender 고정문자1자리 남자이면 'M', 여자이면 'F' 그외값을 입력되지 않도록 한다. 
	 marriage 'Y' 또는 'N'값만을 가질수 있으며 입력되지않으면 'N'값을 가진다. 
	 deptid 숫자3자리 constraint_dept테이블의 키를 참조한다.
	                만약에 constraint_dept테이블의 키값이 삭제되면 
	                참조한 row들이 자동으로 지워지도록 한다. 
     jobid 문자3자리 constraint_job테이블의 키를 참조한다.
 					만약에 constraint_job테이블의 키값이 삭제되면 
	                참조한 row들의 jobid값이 null로 setting되도록 한다.
	                
create table constraint_emp (
	empid char(3) constraint constraint_emp_pk primary key,
	empname varchar2(20) not null,
	email varchar2(25) unique,
	phone varchar2(12),
	hire_date date default sysdate,
	salary number(9),
	gender char(1) constraint 
						gender_ck check (gender in ('M','F')),
	marriage char(1) default 'N' constraint 
										marriage_ck check (marriage in ('Y','N')) ,
	deptid number(3) constraint	deptid_fk 
							references constraint_dept(deptid) on delete cascade,
	jobid char(3) constraint jobid_fk 
							references constraint_job(jobid) on delete set null
);
alter table constraint_emp modify phone varchar2(13);
insert into constraint_emp (empid,empname,email,phone,hire_date,salary,gender,marriage,deptid,jobid)
values ('001','루루','lulu@babo.com','010-1217-1217', '2010-09-09',500,'F','Y',100,'MGR')
-- empid PK, email UNIQUE
insert into constraint_emp (empid,empname,email,phone,hire_date,salary,gender,marriage,deptid,jobid)
values ('002','루루2','lulu2@babo.com','010-1217-1217', '2010-09-10',500,'F','Y',100,'MGR')
--phone null
insert into constraint_emp (empid,empname,email,hire_date,salary,gender,marriage,deptid,jobid)
values ('003','루루3','lulu3@babo.com','2010-09-11',500,'F','Y',100,'MGR')
--hire_date default
insert into constraint_emp (empid,empname,email,salary,gender,marriage,deptid,jobid)
values ('004','루루4','lulu4@babo.com',500,'F','Y',100,'MGR')
--gender
insert into constraint_emp (empid,empname,email,salary,gender,marriage,deptid,jobid)
values ('005','겔겔','gelgel@zzang.com',500,'M','Y',100,'MGR')
--gender null, marriage defualt 
insert into constraint_emp (empid,empname,email,salary,deptid,jobid)
values ('006','겔겔2','gelgel2@zzang.com',500,100,'MGR')
--deptid FK
insert into constraint_emp (empid,empname,email,salary,deptid,jobid)
values ('007','겔겔3','gelgel3@zzang.com',500,200,'MGR')
--deptid FK null
insert into constraint_emp (empid,empname,email,salary,jobid)
values ('008','겔겔4','gelgel4@zzang.com',500,'MGR')
--jobid FK
insert into constraint_emp (empid,empname,email,salary,jobid)
values ('009','겔겔5','gelgel5@zzang.com',500,'INT')
--jobid FK
insert into constraint_emp (empid,empname,email,salary,jobid)
values ('008','겔겔4','gelgel4@zzang.com',500,'INT')

select * from constraint_emp;
select *
from user_constraints
where table_name = 'CONSTRAINT_DEPT'

select *
from user_cons_columns
where table_name = 'CONSTRAINT_DEPT'

select a.table_name, a.constraint_name, a.search_condition, a.constraint_type, 
       b.column_name 
from user_constraints a, user_cons_columns b
where a.owner = 'HR'
and a.table_name = 'CONSTRAINT_EMP'
and a.owner = b.owner
and a.constraint_name = b.constraint_name;

 
 