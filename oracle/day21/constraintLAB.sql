���������� �����ϴ� ���̺��� �����Ͻÿ�.
1. table�̸� : constraint_dept
   column�̸�:
  	deptid ����3�ڸ� �⺻Ű
  	deptname ��������20�ڸ� null�� ��������ʴ´�.

create table constraint_dept(
	deptid number(3) constraint dept_pk primary key,
	deptname varchar2(20) not null
)
insert into constraint_dept(deptid, deptname) values(100,'���ߺ�');
insert into constraint_dept(deptid, deptname) values(200,'������');
insert into constraint_dept(deptid, deptname) values(300,'�ѹ���');
insert into constraint_dept(deptid, deptname) values(400,'�λ��');  	
2.table�̸� : constraint_job 
   column�̸�:
  	jobid ����3�ڸ� �⺻Ű
  	jobname ��������20�ڸ� null�� ��������ʴ´�.
  	
create table constraint_job (
	jobid char(3) constraint job_pk primary key,
	jobname varchar2(20) not null
)
insert into constraint_job(jobid, jobname) values('MGR','Manager');
insert into constraint_job(jobid, jobname) values('INT','Intern');
insert into constraint_job(jobid, jobname) values('STF','���');

3.table�̸� : constraint_emp
	column�̸�:
	 empid ��������3�ڸ� �⺻Ű
	 empname ��������20�ڸ� null�� ��������ʴ´�.
	 email ��������25�ڸ� �����Ѱ��� ������.
	 phone ��������12�ڸ� null�� ����Ѵ�.
	 hire_date ��¥Ÿ�� �Է��������� ��� �ý��۳�¥�� default�� �Էµȴ�.
	 salary ����9�ڸ� null�� ����Ѵ�.
	 gender ��������1�ڸ� �����̸� 'M', �����̸� 'F' �׿ܰ��� �Էµ��� �ʵ��� �Ѵ�. 
	 marriage 'Y' �Ǵ� 'N'������ ������ ������ �Էµ��������� 'N'���� ������. 
	 deptid ����3�ڸ� constraint_dept���̺��� Ű�� �����Ѵ�.
	                ���࿡ constraint_dept���̺��� Ű���� �����Ǹ� 
	                ������ row���� �ڵ����� ���������� �Ѵ�. 
     jobid ����3�ڸ� constraint_job���̺��� Ű�� �����Ѵ�.
 					���࿡ constraint_job���̺��� Ű���� �����Ǹ� 
	                ������ row���� jobid���� null�� setting�ǵ��� �Ѵ�.
	                
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
values ('001','���','lulu@babo.com','010-1217-1217', '2010-09-09',500,'F','Y',100,'MGR')
-- empid PK, email UNIQUE
insert into constraint_emp (empid,empname,email,phone,hire_date,salary,gender,marriage,deptid,jobid)
values ('002','���2','lulu2@babo.com','010-1217-1217', '2010-09-10',500,'F','Y',100,'MGR')
--phone null
insert into constraint_emp (empid,empname,email,hire_date,salary,gender,marriage,deptid,jobid)
values ('003','���3','lulu3@babo.com','2010-09-11',500,'F','Y',100,'MGR')
--hire_date default
insert into constraint_emp (empid,empname,email,salary,gender,marriage,deptid,jobid)
values ('004','���4','lulu4@babo.com',500,'F','Y',100,'MGR')
--gender
insert into constraint_emp (empid,empname,email,salary,gender,marriage,deptid,jobid)
values ('005','�ְ�','gelgel@zzang.com',500,'M','Y',100,'MGR')
--gender null, marriage defualt 
insert into constraint_emp (empid,empname,email,salary,deptid,jobid)
values ('006','�ְ�2','gelgel2@zzang.com',500,100,'MGR')
--deptid FK
insert into constraint_emp (empid,empname,email,salary,deptid,jobid)
values ('007','�ְ�3','gelgel3@zzang.com',500,200,'MGR')
--deptid FK null
insert into constraint_emp (empid,empname,email,salary,jobid)
values ('008','�ְ�4','gelgel4@zzang.com',500,'MGR')
--jobid FK
insert into constraint_emp (empid,empname,email,salary,jobid)
values ('009','�ְ�5','gelgel5@zzang.com',500,'INT')
--jobid FK
insert into constraint_emp (empid,empname,email,salary,jobid)
values ('008','�ְ�4','gelgel4@zzang.com',500,'INT')

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

 
 