sql_lab2(������ �Լ�)
7. �� �μ��� �ο����� ��ȸ�ϵ� �ο����� 5�� �̻��� �μ��� ��µǵ��� �Ͻÿ�.
select * from departments

select d.department_name, count(*) 
from departments d, employees e
where d.department_id = e.department_id
group by d.department_name
having count(*) >= 5
order by count(*) desc

select department_id, count(*)
from employees
group by department_id
having count(*) >= 5
order by count(*) desc
order by department_id

8. �� �μ��� �ִ�޿��� �ּұ޿��� ��ȸ�Ͻÿ�.
   ��, �ִ�޿��� �ּұ޿��� ���� �μ��� ������ �Ѹ��� ���ɼ��� ���⶧���� 
   ��ȸ������� ���ܽ�Ų��.

select d.department_name, max(e.salary), min(salary)
from employees e join departments d on (e.department_id = d.department_id)
group by department_name
having max(e.salary) <> min(e.salary)
order by department_name asc
   
   
select department_id, max(salary), min(salary)
from employees
group by department_id
having max(salary) <> min(salary)

   
9. �μ��� 50, 80, 110 ���� ������ �߿��� �޿��� 5000 �̻� 24000 ���ϸ� �޴�
   �������� ������� �μ��� ��� �޿��� ��ȸ�Ͻÿ�.
   ��, ��ձ޿��� 8000 �̻��� �μ��� ��µǾ�� �ϸ�, ��°���� ��ձ޿��� ����
   �μ����� ��µǵ��� �ؾ� �Ѵ�.

select d.department_name, avg(e.salary)
from employees e join departments d using(department_id)
where department_id in (50,80,110) and e.salary between 5000 and 24000
group by d.department_name
having avg(e.salary) >= 8000
order by avg(e.salary) desc

   
select department_id, avg(salary)
from employees
where department_id in (50,80,110) and salary between 5000 and 24000
group by department_id
having avg(salary) >= 8000
order by avg(salary) desc

----------------------------------------------------------------------------------
select * from employees
select 
		count(employee_id) �����Ǽ�,
		count(*) �����Ǽ�2,
		count(department_id) �����Ǽ�3,
		count(nvl(commission_pct,0)) �����Ǽ�4,
		count(distinct nvl(department_id,999)) �����Ǽ�4
from employees

select min(hire_date), max(hire_date)
from employees







----------------------------------------------------------------------------------
*************************************************************************************
*************************************************************************************
*************************************************************************************
*************************************************************************************
select * from employees
select * from jobs
select e.first_name, d.department_name, j.job_title
from employees e join departments d using (department_id)
				join jobs j on (e.job_id = j.job_id)
				
join using, join on �����ؼ� ��밡���ѵ�
join using ���� �����÷����� ������ �÷��� �� �ٸ� ���̺�� join on(����.�÷� = ����.�÷�) ���� ���� �������� �׽�Ʈ�غ���
�����쿡 �̷��� ��밡������.
��������?
�����÷����� ���� �÷�, �������� �÷� �׽�Ʈ�غ���
*************************************************************************************
*************************************************************************************
*************************************************************************************
*************************************************************************************
----------------------------------------------------------------------------------



----------------------------------------------------------------------------------
----------------------------------------------------------------------------------