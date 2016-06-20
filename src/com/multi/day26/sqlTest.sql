select employee_id, first_name, department_name 
from employees join departments using (department_id)
order by employee_id

create table member(
	mno number primary key,
	mname varchar2(20) not null,
	phone varchar2(13),
	email varchar2(20),
	birthdate date
);



insert into member (mno,mname,phone,email,birthdate) 
values (1,'gelgel','010-1234-1234','lee.gelgel@gmail.com',sysdate);

select * from member