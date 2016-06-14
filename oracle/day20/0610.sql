char : ����
varhcar2 : ����

--�л�
create table student(
	student_id char(10) constraint student_pk primary key,
	name varchar2(30) not null,
	major_id number(2) constraint major_fk references majortable(major_id),
	grade number(2) constraint,
	email varchar2(30) constraint uni_email unique
);

--table level�߰�
alter table student drop column grade;
--2��
alter table student add grade number(2); 
alter table student add constraint grade_ck check (grade in (1,2,3,4));
--1��
alter table student add grade number(2) constraint grade_ck check (grade in (1,2,3,4));
--address
alter table student drop column address;
alter table student add address varchar(100);
alter table student add constraint addr_ck check(length(address) > 10);

--mobile
alter table student drop column mobile;
alter table student add mobile char(13) constraint mobi_ck check(mobile like '010-____-____');
alter table student add mobile char(13) constraint mobi_ck check(substr(mobile,1,3)='010');


--����
create table scoretable(
	student_id char(10),
	subject varchar2(60),
	score number(3) not null,
	constraint scoretable_pk primary key(student_id, subject)	
);

--����
create table majortable(
	major_id number(2) primary key,
	major_name varchar2(30),
	credit number(2)
)

drop table student;
drop table scoretable;
drop table major_id;
select * from student;
select * from majortable;

select * from employees
select * from departments

insert into employees (employee_id, last_name, email,job_id,hire_date,department_id)
	   values (99,'gelgel','lee.gelgel@gmail.com',null,sysdate,123)

--�л�
insert into student (student_id,name,major_id,grade,email,address,mobile)
	   values ('667890123','donald',40,3,'dldcom3@gmail.com','����� ������ ���ﵿ','010-1234-1234');
insert into student (student_id,name,major_id,grade,email,address)
	   values ('56789012','donald',40,3,'dldcom2@gmail.com','����� ������ ���ﵿ');
insert into student (student_id,name,major_id,grade,email)
	   values ('45678901','donald',40,3,'dldcom@gmail.com');
insert into student (student_id,name,major_id,grade,email)
	   values ('12345678','gelgel',10,5,'lee.gelgel@gmail.com');
insert into student (student_id,name,major_id,grade,email)
	   values ('23456789','lulu',20,1,'park.lulu@gmail.com');
insert into student (student_id,name,major_id,grade,email)
	   values ('34567890','simon',30,2,'hunlee001@naver.com');
	   
	   
--����
insert into majortable values(10, '��ǻ�Ͱ��а�',3);
insert into majortable values(20, '������Ű��а�',2);
insert into majortable values(30, '�������ڰ��а�',3);
insert into majortable values(40, '��īƮ�δн����а�',2);
insert into majortable values(50, 'ö�а�',3);



select s.*, m.major_name
from student s, majortable m
where s.major_id = m.major_id

select *
from user_constraints