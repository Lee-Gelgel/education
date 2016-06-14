CREATE TABLE s_emp
(id                         NUMBER(7)
   CONSTRAINT s_emp_id_nn NOT NULL,
 name                  VARCHAR2(25)
   CONSTRAINT s_emp_name_nn NOT NULL,
 mailid                     VARCHAR2(8),
 start_date                 DATE,
 manager_id                 NUMBER(7),
 title                      VARCHAR2(25),
 dept_id                    NUMBER(7),
 salary                     NUMBER(11, 2),
 commission_pct             NUMBER(4, 2),
     CONSTRAINT s_emp_id_pk PRIMARY KEY (id),
     CONSTRAINT s_emp_userid_uk UNIQUE (mailid),
     CONSTRAINT s_emp_commission_pct_ck
        CHECK (commission_pct IN (10, 12.5, 15, 17.5, 20)));
COMMENT ON COLUMN s_emp.salary IS 'S_EMP 테이블의 급여의 단위는 천원임';

alter session set nls_date_language=AMERICAN;

alter session set nls_date_format='DD-MON-RR';

INSERT INTO s_emp VALUES (
  100, '박X_Y구곤', 'sky98',
   '03-MAR-90', NULL, '사장',
   118, 5000, NULL);
INSERT INTO s_emp VALUES (
   222, '손명성2', '2xxsig2',
   '08-MAR-90', 1, '기획부장',
   110, 3000, NULL);
INSERT INTO s_emp VALUES (
   3, '이은선', 'ch21175',
   '17-JUN-91', 1, '영업부장',
   102, 3500, NULL);
INSERT INTO s_emp VALUES (
   4, '서의홍', 'mquickto',
   '07-APR-90', 1, '총무부장',
   101, 3000, NULL);
INSERT INTO s_emp VALUES (
   5, '김심선', 'aropebur',
   '04-MAR-90', 1, '인사부장',
   118, 3200, NULL);
INSERT INTO s_emp VALUES (
   6, '전지영', 'murguhar',
   '18-JAN-91', 2, '과장',
   110, 2400, NULL);
INSERT INTO s_emp VALUES (
   7, '김정미', 'enchu',
   '14-MAY-90', 2, '과장',
   111, 2400, NULL);
INSERT INTO s_emp VALUES (
   8, '신기웅', 'bbiri',
   '07-APR-90', 2, '과장',
   112, 2100, NULL);
INSERT INTO s_emp VALUES (
   9, '이상헌', 'acatchpo',
   '09-FEB-92', 2, '과장',
   113, 2300, NULL);
INSERT INTO s_emp VALUES (
   10, '최순철', 'mhavel',
   '27-FEB-91', 2, '과장',
   113, 2300, NULL);
INSERT INTO s_emp VALUES (
   11, '최정선', 'cmagee',
   '14-MAY-90', 3, '영업대표이사',
   102, 2450, 10);
INSERT INTO s_emp VALUES (
   12, '안은경', 'hgiljum',
   '18-JAN-92', 3, '영업대표이사',
   103, 2500, 12.5);
INSERT INTO s_emp VALUES (
   13, '김석우', 'ysedeghi',
   '18-FEB-91', 3, '영업대표이사',
   104, 2650, 10);
INSERT INTO s_emp VALUES (
   14, '박성규', 'mnguyen',
   '22-JAN-92', 3, '영업대표이사',
   105, 2650, 15);
INSERT INTO s_emp VALUES (
   15, '신종필', 'adumas',
   '09-OCT-91', 3, '영업대표이사',
   106, 2400, 17.5);
INSERT INTO s_emp VALUES (
   16, '이기철', 'emaduro',
   '07-FEB-92', 6, '사원',
   110, 2400, NULL);
INSERT INTO s_emp VALUES (
   17, '구원상', 'gsmith',
   '08-MAR-90', 6, '사원',
   110, 940, NULL);
INSERT INTO s_emp VALUES (
   18, '서정주', 'anozaki',
   '09-FEB-91', 7, '사원',
   111, 1200, NULL);
INSERT INTO s_emp VALUES (
   19, '안창환', 'vpatel',
   '06-AUG-91', 7, '사원',
   111, 795, NULL);
INSERT INTO s_emp VALUES (
   20, '윤정숙', 'cnewman',
   '21-JUL-91', 8, '사원',
   112, 750, NULL);
INSERT INTO s_emp VALUES (
   21, '장현철','amarkari',
   '26-MAY-91', 8, '사원',
   112, 850, NULL);
INSERT INTO s_emp VALUES (
   22, '장혜숙', 'echang',
   '30-NOV-90', 9, '사원',
   113, 800, NULL);
INSERT INTO s_emp VALUES (
   23, '강연범', 'rpatel',
   '17-OCT-90', 9, '사원',
   106, 795, NULL);
INSERT INTO s_emp VALUES (
   24, '오은경', 'bdancs',
   '17-MAR-91', 10, '사원',
   113, 860, NULL);
INSERT INTO s_emp VALUES (
   25, '이용호', 'sschwart',
   '09-MAY-91', 10, '사원',
   113, 1100, NULL);
COMMIT;