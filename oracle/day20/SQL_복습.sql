Ư���� �˻� ����
(1) Ư�� ������ ���� �� �˻�
	Select first_name, salary from employees 
     where salary < 3000;
(2) �� ������ ��� ū �� �˻� (�ִ밪���� ũ��)
	Select first_name, salary from employees 
     where salary > ALL(5000,10000);
     
     Select first_name, salary from employees 
     where salary > 5000 and salary > 10000;
(3) ��� �� ������ ū �� �˻� (�ּҰ����� ũ��)

	Select first_name, salary from employees 
     where salary > ANY(5000,10000);
     
	Select first_name, salary from employees 
     where salary > 5000 or salary > 10000;
     
     

(4) Between~AND~
	Select * from employees
     where salary between 800 and 1000;

	Select * from employees
     where salary>=800 and salary <=1000;
(5) IN
	 Select * from employees
      where department_id in (10,30);

      Select * from employees
      where department_id = 10 or department_id = 30

(6) LIKE
	where first_name like 'S%'
=================
�Ϲ��Լ� ����
select * from s_emp
(1) s_emp ���̺��� ����� �̸�,��å,Ŀ�̼��� ����Ͻÿ�.
     �̶� Ŀ�̼��� ���� ����� 3%�� Ŀ�̼��� �����Ѵ�. 
	select name �̸�, title ��å, nvl(commission_pct,3) Ŀ�̼�
	from s_emp
     
	 
(2) s_emp ���̺��� ����� �̸�,��å,Ŀ�̼��� ����Ͻÿ�.
     �̶� Ŀ�̼��� �ִ� ����� 5% , Ŀ�̼��� ���� ����� 3%�� Ŀ�̼��� �����Ѵ�. 
     select name �̸�, title ��å, nvl2(commission_pct,5,3) Ŀ�̼�
	from s_emp 
	 
(3) s_emp ���̺��� mailid�� a�� �����ϴ� ������ �̸�,������ �˻��Ͻÿ�.
	select name �̸�, mailid ����
	from s_emp
	where mailid like 'a%'
	 
(4) s_emp ���̺��� Ŀ�̼��� ������ Ŀ�̼��� Ŀ�̼��� ������ �ش� �޿��� , ��� ������ 100�� ����Ͻÿ�.
	select name �̸�,commission_pct Ŀ�̼�,salary �޿�, COALESCE(commission_pct,salary,100) ���
	from s_emp
	
	select commission_pct,salary
	from s_emp
	where commission_pct is null and salary is null

	 
(5) �μ���ȣ�� 20�̸�  ������, 30�̸� ������, 40�̸� hr�� �׷��������� �μ������� ����Ͻÿ� 
	select * from s_EMP 
	select name, dept_id,decode(dept_id,110,'������',111,'������',112,'hr��','�μ�����')
	from s_emp
	 	
(6) S_EMP ���̺��� ��å�� �����̸� �޿��� 10%, �����̸� 7%, ����̸� 5%�� �޿��� �λ��Ϸ��� �Ѵ�. DECODE�� CASE���� �̿��Ͽ� �޿��� ���� ������� ����Ͻÿ�.
	select name,title, decode(
								case when title like '%����' then '����'
									 when title like '%����' then '���� '
									 when title like '%���' then '��� '
												end
												, '����' , salary*1.1
												, '����' , salary*1.07
												, '���' , salary*1.05
												, salary ) �޿�
	from s_emp
	order by 3 desc
	

(7) S_EMP ���̺��� �޿��� 400���� �̻��̸� A���, 300���� �̻��̸� B���, 200���� �̻��̸� C���, 100���� �̻��̸� D���, 100���� �̸��̸� E������� ��Ÿ���ÿ� 
	select name, salary, case when salary >= 400 then 'A���' 
							  when salary >= 300 then 'B���'
							  when salary >= 200 then 'C���'
							  when salary >= 100 then 'D���'
							  else '���'
						 end ���
	from s_emp
	 
(8) S_EMP ���̺��� ��ü ����� ���Ͽ� �μ���ȣ,�̸�,�޿�, �ش� �μ��� ����� �޿� ������ ����Ͻÿ�.

SELECT DEPT_ID, NAME, SALARY,
        RANK() OVER(PARTITION BY DEPT_ID ORDER BY SALARY DESC)
FROM S_EMP;

	
==========================
GROUP BY�� 
(1) �μ��� ��� �޿� ��ȸ�ϱ�
	 select dept_id, avg(salary)
	 from s_emp
	 group by dept_id

(2) ��å�� ����� ������ ���� �μ��� ��� �޿� ��ȸ�ϱ�
	select dept_id,avg(salary)
	from s_emp
	where title = '���'
	group by dept_id
	
	select d.name, avg(e.salary)
	from s_emp e join s_dept d on ( e.dept_id=d.id)
	where e.title = '���'
	group by d.name
	
	

(3) �μ��� ��� �޿� ��ȸ�ϱ�. ��,��ձ޿��� 2000�̻�.
	select d.name, avg(e.salary)
	from s_emp e join s_dept d on ( e.dept_id=d.id)
	group by d.name
	having avg(e.salary) >= 2000
	 

(4) �μ��� ���޺� �޿��հ� ��ȸ�ϱ� ��, �Ұ谪 �Բ� ���
	select d.name, e.title, sum(e.salary) "�μ��� �޿��հ�"
	from s_emp e join s_dept d on ( e.dept_id=d.id)
	group by rollup(d.name, e.title)
	order by 1,2
	
	select sum(salary)
	from s_emp
	
	select nvl(d.name,'�հ�') �μ��� , nvl(e.title,'�Ұ�') ���޺�, sum(e.salary) "�μ��� �޿��հ�"
	from s_emp e join s_dept d on ( e.dept_id=d.id)
	group by cube(d.name, e.title)
	order by 1
      
(5) �μ��� �޿��հ� ��ȸ�ϱ� ��, �Ұ谪 �Բ� ���
  


======================================
SubQuery 

1.��ü ����� �߿� ��� �޿����� ���� �޿��� �޴� ����� ����� ��ȸ�Ͻÿ�.
select e1.first_name �̸�, e1.department_id �μ���ȣ, e1.salary �޿�, round(e2.avgsal,1) ��ձ޿�
from employees e1 join (select department_id, avg(salary) avgsal
					 from employees
					 group by department_id) e2 on (e1.department_id = e2.department_id)	
where e1.salary < e2.avgsal
			

2.�޿��� ���� ���� ���� ������ ������ ��ȸ�Ͻÿ�
select e1.first_name �̸�, e1.salary �޿�
from employees e1, (select max(salary) maxsal from employees) e2
where e1.salary = e2.maxsal

3.Country_id�� ��US���� �μ����� ������ ��ȸ�Ͻÿ�.
select * from departments
select * from locations

select d.*,l.country_id
from departments d join (select location_id, country_id
				   		 from locations
						 where country_id='US') l 
				   on (d.location_id = l.location_id)

4.30�� �μ��� ����� �� �ƹ��� �Ѹ��� ���޺��� ���� �޴� ����� ��ȸ�Ͻÿ�. ( >ANY : �ּҺ��� ũ���� �ǹ�)

select *
from employees 
where salary > any (select salary
					from employees
					where department_id=30)

select min(salary)
from employees
where department_id=30

select *
from employees
where salary > 2500

5.30�� �μ��� ����� ����� ���޺��� ���� �޴� ����� ��ȸ�Ͻÿ�. ( >ALL : �ִ뺸�� ũ���� �ǹ�) 


select *
from employees 
where salary > all (select salary
					from employees
					where department_id=30)
					
select max(salary)
from employees
where department_id=30

select *
from employees
where salary > 11000

6.30�� �μ��� ������ ���� ������ �޴� ����� ��ȸ�Ͻÿ�. ( =ANY: IN�� ���� �ǹ�) 
select *
from employees 
where salary = any (select salary
					from employees
					where department_id=30)
					
select salary
from employees
where department_id=30
11000/3
3100/4
2900/3
2800/4
2600/4
2500/6
select *
from employees
where salary = 2500


7.�μ��� �ּ� �޿��� �޴� ������ ������ ��ȸ�Ͻÿ�
select e1.first_name,e1.department_id, e1.salary
from employees e1 join (select department_id, min(salary) minsal
					from employees
					group by department_id) e2 on (e1.department_id = e2.department_id)
where e1.salary = e2.minsal
order by 2

select * from employees where department_id=20 and salary=6000

8.������ �޴� �޿��� ������ ���� �μ��� ��� �޿����� ���� �޿��� �޴� ������ �̸�, �μ���ȣ, �޿��� ��ȸ�Ͻÿ�.

select e1.first_name,e1.department_id, e1.salary, e2.avgsal
from employees e1 join (select department_id, avg(salary) avgsal
					from employees
					group by department_id) e2 on (e1.department_id = e2.department_id)
where e1.salary < e2.avgsal

9.��� �޿����� ���� �ִ� �޿����� ���� ������ �޴� ������� ��ȸ�Ͻÿ�
select e1.first_name,e1.department_id, e1.salary, e2.avgsal,e2.maxsal
from employees e1, (select avg(salary) avgsal, max(salary) maxsal
					from employees) e2
where salary between e2.avgsal and e2.maxsal

========================================
========================================
N-TOP
select *
from (
select rownum rank, aa, employee_id, first_name, salary
from (
		select rownum aa, employee_id, first_name, salary
		from employees
		order by salary desc )
		where rownum <=5 )
where rank between 4 and 5





1. �޿��� ���� ���� �޴� ���� 5���� ���� ������ ��ȸ�Ͻÿ�.
	select rownum rank, e.*
	from	(
			select *
			from employees
			order by salary desc
			) e
	where rownum <=5
	
	select *
	from 	(
			select rownum rank, e.*
			from (
					select *
					from employees
					order by salary desc
					) e
			where rownum <=5	
			)
	where rank between 2 and 3
	

2. Ŀ�̼��� ���� ���� �޴� ���� 3���� ���� ������ ��ȸ�Ͻÿ�.
select rownum rank, e.*
from	(
		select *
		from employees
		order by commission_pct desc nulls last
		) e
where rownum <=3

select *
from	(
		select rownum rank, e.*
		from	(
				select *
				from employees
				order by commission_pct desc nulls last
				) e
		where rownum <=3
		)
where rank between 2 and 3


3. ���� �Ի��� ���� ��ȸ�ϵ�, �Ի��� ���� 5�� �̻��� ���� ����Ͻÿ�.

select (to_char(hire_date,'mm')) ����, count(to_char(hire_date,'mm')) "�Ի��� ��"
from employees
group by (to_char(hire_date,'mm'))
order by ����

select (to_char(hire_date,'mm'))||'��' ����, count(to_char(hire_date,'mm')) "�Ի��� ��"
from employees
group by rollup( (to_char(hire_date,'mm')))
having count(to_char(hire_date,'mm'))>=5
order by ����


4. �⵵�� �Ի��� ���� ��ȸ�Ͻÿ�. 
��, �Ի��ڼ��� ���� �⵵���� ��µǵ��� �մϴ�.
select *
from 	(
		select rownum rank, e.*
			from (
				select (to_char(hire_date,'yyyy'))||'�� '||count(to_char(hire_date,'yyyy'))||'��' "�⵵�� �Ի��ڼ�"
				from employees
				group by (to_char(hire_date,'yyyy'))
				order by count(to_char(hire_date,'yyyy')) desc ) e
		)
where rank between 3 and 5
		



 