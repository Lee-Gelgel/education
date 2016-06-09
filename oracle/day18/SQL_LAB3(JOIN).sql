========================================
		JOIN
========================================
select * from employees
select * from jobs
select * from departments
select * from locations
select * from countries

1.�������� �̸��� ���޸�(job_title)�� ��ȸ�Ͻÿ�.
select e.first_name as "�̸�", j.job_title as "���޸�"
from employees e, jobs j
where e.job_id = j.job_id

2.�μ��̸��� �μ��� ���� ���ø�(city)�� ��ȸ�Ͻÿ�.
select d.department_name, l.city
from departments d, locations l
where d.location_id = l.location_id

3. ������ �̸��� �ٹ��������� ��ȸ�Ͻÿ�. (employees, departments, locations,countries)
 select e.first_name, c.country_name
 from employees e, departments d, locations l, countries c
 where e.department_id = d.department_id
 		and d.location_id = l.location_id
 		and l.country_id = c.country_id


4. ��å(job_title)�� 'manager' �� ����� �̸�, ��å, �μ����� ��ȸ�Ͻÿ�.
select e.first_name, j.job_title, d.department_name
from employees e , jobs j, departments d
where e.job_id = j.job_id
		and e.department_id = d.department_id
		and j.job_title like initcap('%manager')

--to_char(e.hire_date,'dd')
5. �������� �̸�, �Ի���, �μ����� ��ȸ�Ͻÿ�.
select e.first_name �̸�,to_char(e.hire_date,'yyyy-mm-dd') �Ի���, d.department_name �μ���
from employees e, departments d
where e.department_id = d.department_id


6. �������� �̸�, �Ի���, �μ����� ��ȸ�Ͻÿ�.
��, �μ��� ���� ������ �ִٸ� �� ���������� ��°���� ���Խ�Ų��.
select e.first_name,to_char(e.hire_date,'yyyy-mm-dd'), d.department_name
from employees e, departments d
where e.department_id = d.department_id(+)


7. ������ �̸��� ��å(job_title)�� ����Ͻÿ�.
��, ������ �ʴ� ��å�� �ִٸ� �� ��å������ ��°���� ���Խ�Ű�ÿ�.
select e.first_name, j.job_title
from employees e , jobs j 
where e.job_id(+) = j.job_id


select e.first_name, j.job_title
from employees e right join jobs j on(e.job_id = j.job_id)


