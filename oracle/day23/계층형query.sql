--Connect by ������ ������ ����Ŭ���� ���� ��� �� �ϳ���, 
--�����͸� �����Ͽ� �������� ���� �״�� �����ϴµ� 
--���ȴ�.
/*
start with
select ������ start with ���� ���� ������ 
� �࿡�� �����ϴ��� �����ϴ� ����� �Ѵ�.
 ���� : start with <����>
 
Connect by Prior
connect by ���� �� ���� ��� ����Ǵ����� 
����Ŭ���� �˷��ִ� ������ �Ѵ�. 
�� ���� ���� ������ �� ���� ���踦 �����ϴ� ���̴�.
���� ��� �ٸ� ���� Prior��� Ű���带 ���� �����ȴ�.
Prior�� ���� ���� �����ϴ� ������, 
connect by ���ӻ�� = prior ���� 

level�� ����Ŭ���� ����Ǵ� 
��� ���� ������ ��� ������ ���󿭷μ�, 
Ʈ�� ������ � �ܰ�(level)�� �ִ����� ��Ÿ���� 
�������̴�.�������� ������ �ƴ϶�� ��� ���� 0 �̴�.
 where ���� ������ ��ü Ʈ���� ������ �Ŀ� �ٽ� �����ϴ� �ݸ�, connect by ���� ������ �� ������ ����ؼ� Ʈ���� �����ϱ� ������ ���� ȿ����
where level < 4
connect by manager_id =  prior employee_id and level <= 4
*/
 
select level, employee_id,lpad(' ',(level-1)*4)||first_name,
       manager_id
from employees
start with manager_id is null
connect by manager_id =  prior employee_id 
 

select employee_id, lpad(' ',(level-1)*4)||first_name,
       manager_id
from employees
start with first_name='John'
connect by  prior manager_id =  employee_id 

