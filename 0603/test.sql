1. �̸��� 'adam' �� ������ �޿��� �Ի����� ��ȸ�Ͻÿ�.
select first_name, salary, hire_date
from employees
where first_name = initcap('adam')

2. ���� ���� 'united states of america' �� ������ ���� �ڵ带 ��ȸ�Ͻÿ�.
SELECT COUNTRY_ID, COUNTRY_NAME FROM COUNTRIES
WHERE COUNTRY_NAME = REPLACE(initcap('United States of America'),'Of','of')



3. 'Adam�� �Ի����� 95/11/02 �̰�, �޿��� 7000 �Դϴ�.' �̷� ������ ����
������ ��ȸ�Ͻÿ�.
select first_name||'�� �Ի����� '|| hire_date||'�̰�, �޿��� ' ||salary||' �Դϴ�.' "�������� ��ȸ"
from employees




4. �̸��� 5���� ������ �������� �̸�, �޿�, �Ի����� ��ȸ�Ͻÿ�.
select first_name, salary, hire_date
from employees
where LENGTH(first_name) <= 5



5. 2005�⵵�� �Ի��� ������ �̸�, �Ի����� ��ȸ�Ͻÿ�.
select first_name, hire_date
from employees
where to_char(hire_date,'yyyy') = 2005



6. 10�� �̻� ��� �ټ��� �������� �̸�, �Ի���, �޿�, �ٹ������� ��ȸ�Ͻÿ�.
select first_name, hire_date, salary, to_char(sysdate,'yyyy')-to_char(hire_date,'yyyy') �ٹ�����
from employees
where to_char(sysdate,'yyyy')-to_char(hire_date,'yyyy') >= 10