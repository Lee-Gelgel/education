-- SELF JOIN
1. ������ �̸��� ������ �̸��� ��ȸ�Ͻÿ�.
select * from employees
select e.first_name ����, m.first_name ������
from employees e, employees m
where e.employee_id = m.manager_id
order by m.first_name

2. ������ �̸��� ������ �̸��� ��ȸ�Ͻÿ�.
�����ڰ� ���� ���������� ��� ����Ͻÿ�.
select e.employee_id ����id, e.first_name, m.employee_id, m.first_name
from employees e, employees m
where e.manager_id = m.employee_id


3. ������ �̸��� �����ڰ� �����ϴ� ������ ���� ��ȸ�Ͻÿ�.
��, ������������ 3�� �̻��� �����ڸ� ��µǵ��� �Ͻÿ�.

select m.first_name, count(e.first_name)
from employees e, employees m
where e.manager_id = m.employee_id
group by m.first_name
having count(e.first_name) >=3
order by 2
