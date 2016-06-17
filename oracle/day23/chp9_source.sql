

-- UNION
SELECT 1, 3, 4, 5, 7, 8
  FROM DUAL;

SELECT 2, 4, 5, 8, 9
  FROM DUAL; 


SELECT 1, 3, 4, 5, 7, 8
  FROM DUAL
 UNION
SELECT 2, 4, 5, 8, 9
  FROM DUAL;



SELECT 1, 3, 4, 5, 7, 8
  FROM DUAL
 UNION
SELECT 2, 4, 5, 8, 9, NULL
  FROM DUAL;
  
  --union(내부적으로 sort를 실행한다, 속도가느림) 중복값 제외
  --union all(보통 유니온을 사용할때는 중복값이 포함되어있지 않기때문에 사용한다, 
  --중복값이 있으면 조인을 사용했을것, 그러므로 속도가 빠른 union all 추천) 중복값 포함
SELECT 1, 3, 4, 5, 7, 8
  FROM DUAL
 UNION all
SELECT 2, 4, 5, 8, 9, NULL
  FROM DUAL
  union all
  SELECT 1, 3, 4, 5, 7, 8
  FROM DUAL
 UNION all
SELECT 2, 4, 5, 8, 9, NULL
  FROM DUAL;
  
  select '직원' title,employee_id, first_name
  from employees
  --order by 1
  union all
  select '부서',department_id, department_name
  from departments
  order by 1

SELECT emp.employee_id, emp.first_name, emp.last_name
  FROM employees emp,
       departments dep,
       locations loc
 WHERE emp.department_id = dep.department_id
   AND dep.location_id = loc.location_id
   AND loc.country_id = 'DE';


SELECT customer_id, cust_first_name, cust_last_name
  FROM customers
 WHERE nls_territory = 'GERMANY';


SELECT emp.employee_id, emp.first_name, emp.last_name
  FROM employees emp,
       departments dep,
       locations loc
 WHERE emp.department_id = dep.department_id
   AND dep.location_id = loc.location_id
   AND loc.country_id = 'DE'
 UNION
SELECT customer_id, cust_first_name, cust_last_name
 FROM customers
WHERE nls_territory = 'GERMANY';

SELECT emp.first_name, emp.employee_id, emp.last_name
  FROM employees emp,
       departments dep,
       locations loc
 WHERE emp.department_id = dep.department_id
   AND dep.location_id = loc.location_id
   AND loc.country_id = 'DE'
 UNION
SELECT customer_id, cust_first_name, cust_last_name
  FROM customers
 WHERE nls_territory = 'GERMANY';


CREATE TABLE set1 (
         id1  INTEGER,
         names1 CHAR(5)
);


CREATE TABLE set2 (
         id2  NUMBER,
         names2 VARCHAR2(5)
);

drop table set2
INSERT INTO set1 VALUES ( 1, 'AAA');

INSERT INTO set2 VALUES ( 2, 'BB');


SELECT id1, names1
  FROM set1
 UNION
SELECT id2, names2
  FROM set2;

ALTER TABLE set2 
ADD  last_names VARCHAR(10);

UPDATE set2
   SET last_names = 'developer';
   
SELECT id1, names1, ' ' title
  FROM set1
 UNION
SELECT id2, names2, last_names
  FROM set2;


SELECT emp.employee_id , emp.first_name, emp.last_name
  FROM employees emp,
       departments dep,
       locations loc
 WHERE emp.department_id = dep.department_id
   AND dep.location_id = loc.location_id
   AND loc.country_id = 'DE'
 UNION
SELECT customer_id, cust_first_name, cust_last_name
  FROM customers
 WHERE nls_territory = 'GERMANY'
 UNION
SELECT id2, names2, last_names
  FROM set2;


DELETE set1;

DELETE set2;

INSERT INTO set1 ( id1, names1 ) VALUES (1, 'AAA');
INSERT INTO set1 ( id1, names1 ) VALUES (1, 'AAA');
INSERT INTO set1 ( id1, names1 ) VALUES (2, 'BBB');
INSERT INTO set1 ( id1, names1 ) VALUES (4, 'DDDDD');

INSERT INTO set2 ( id2, names2 ) VALUES (4, 'DDDDD');
INSERT INTO set2 ( id2, names2 ) VALUES (2, 'BBB');
INSERT INTO set2 ( id2, names2 ) VALUES (3, 'CCC');
INSERT INTO set2 ( id2, names2 ) VALUES (3, 'CCC');

SELECT id1, '*'||names1||'*'
  FROM set1
 UNION
SELECT id2, '*'||names2||'*'
  FROM set2;
  
-- UNION ALL
SELECT id1, names1
  FROM set1
 UNION ALL
SELECT id2, names2
  FROM set2;

-- INTERSECT
SELECT id1, names1
  FROM set1
INTERSECT
SELECT id2, names2
  FROM set2;
----------------------------------------------------
--중복데이터 (JOIN으로 해결해야한다), 교집합으로 사용하는건 좀 아닌듯
select *
from set1 join set2 on (set1.id1 = set2.id2 and set1.names1 = set2.names2)
----------------------------------------------------

SELECT id1
  FROM set1
INTERSECT
SELECT id2
  FROM set2;


SELECT product_id
  FROM inventories
INTERSECT
SELECT product_id
  FROM order_items;

-- MINUS
SELECT id1, names1
  FROM set1
MINUS
SELECT id2, names2
  FROM set2;


SELECT id2
  FROM set2
MINUS
SELECT id1
  FROM set1;


SELECT id1, names1
  FROM set1
MINUS
SELECT id2, names2
  FROM set2;


SELECT product_id
  FROM inventories
MINUS
SELECT product_id
  FROM order_items;


SELECT product_id
  FROM order_items
MINUS
SELECT product_id
  FROM inventories; 

-- SET 연산자와 NULL
SELECT 1 col1, 'FIRST' col2
  FROM DUAL
 UNION
SELECT 2 col2, NULL col2
  FROM DUAL;


SELECT 1 col1, 'FIRST' col2
  FROM DUAL
 UNION
SELECT NULL col2, 'SECOND' col2
  FROM DUAL;


SELECT 1 col1, SYSDATE col2
  FROM DUAL
 UNION
SELECT 2 col2, NULL col2
  FROM DUAL;

-- SET 연산자의 규칙과 제한사항들
SELECT phone_numbers
  FROM customers
 WHERE nls_territory = 'INDIA'
 UNION
SELECT phone_numbers
  FROM customers
 WHERE nls_territory = 'ITALY';


SELECT ID1, NAMES1
  FROM SET1
 ORDER BY 1
 UNION
SELECT ID2, NAMES2
  FROM SET2;


SELECT ID1, NAMES1 
  FROM SET1
 UNION
SELECT ID2, NAMES2
  FROM SET2
 ORDER BY 1;


 
 -- order by 는 서브쿼리 안에서도 안되고, 유니온에서도 마지막에 써야한다.
SELECT emp.employee_id, emp.first_name, emp.last_name
  FROM employees emp,
       departments dep
 WHERE emp.department_id = dep.department_id
   AND dep.location_id in ( SELECT loc.location_id
                              FROM locations loc
	                   		     WHERE loc.country_id = 'DE'
			                       --ORDER BY location_id
			                       )
 UNION
 select department_id, department_name, ' '
 from departments
 


SELECT emp.employee_id, emp.first_name, emp.last_name
  FROM employees emp,
       departments dep
 WHERE emp.department_id = dep.department_id
   AND dep.location_id in ( SELECT loc.location_id
                              FROM locations loc
	                   		     WHERE loc.country_id = 'DE' )
 UNION
SELECT customer_id, cust_first_name, cust_last_name
  FROM customers
 WHERE nls_territory = 'GERMANY';