 
SELECT * FROM USER_OBJECTS 
WHERE OBJECT_TYPE='VIEW';
 
  
-- 부서 번호 10의 데이터를 조회 하는 뷰
SQL> CREATE OR REPLACE VIEW check_option
     AS
       SELECT empno, ename, deptno
       FROM  emp
       WHERE deptno = 10
       WITH CHECK OPTION ;
 
-- 부서 번호가 10인 사원만 INSERT, UPDATE할 수 있다. 
SQL> INSERT INTO check_option(empno, ename, deptno) 
     VALUES (10005, 'jain', 30);

INSERT INTO check_option(empno, ename, deptno)
            *
1행에 오류:
ORA-01402: 뷰의 WITH CHECK OPTION의 조건에 위배 됩니다



-- 아래 뷰는 읽기만 가능하다.
SQL> CREATE OR REPLACE VIEW read_only
     AS
       SELECT empno, ename, deptno
       FROM  emp
       WHERE deptno = 10
       WITH READ ONLY;
       
       