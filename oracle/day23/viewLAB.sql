 
SELECT * FROM USER_OBJECTS 
WHERE OBJECT_TYPE='VIEW';
 
  
-- �μ� ��ȣ 10�� �����͸� ��ȸ �ϴ� ��
SQL> CREATE OR REPLACE VIEW check_option
     AS
       SELECT empno, ename, deptno
       FROM  emp
       WHERE deptno = 10
       WITH CHECK OPTION ;
 
-- �μ� ��ȣ�� 10�� ����� INSERT, UPDATE�� �� �ִ�. 
SQL> INSERT INTO check_option(empno, ename, deptno) 
     VALUES (10005, 'jain', 30);

INSERT INTO check_option(empno, ename, deptno)
            *
1�࿡ ����:
ORA-01402: ���� WITH CHECK OPTION�� ���ǿ� ���� �˴ϴ�



-- �Ʒ� ��� �б⸸ �����ϴ�.
SQL> CREATE OR REPLACE VIEW read_only
     AS
       SELECT empno, ename, deptno
       FROM  emp
       WHERE deptno = 10
       WITH READ ONLY;
       
       