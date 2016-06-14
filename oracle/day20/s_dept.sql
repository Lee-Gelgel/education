CREATE TABLE s_dept
(id                         NUMBER(7)
   CONSTRAINT s_dept_id_nn NOT NULL,
 name                       VARCHAR2(25)
   CONSTRAINT s_dept_name_nn NOT NULL,
 region_id                  NUMBER(7),
     CONSTRAINT s_dept_id_pk PRIMARY KEY (id),
     CONSTRAINT s_dept_name_region_id_uk UNIQUE (name, region_id));

INSERT INTO s_dept VALUES (
   101, '총무부', 1);
INSERT INTO s_dept VALUES (
   102, '영업부', 1);
INSERT INTO s_dept VALUES (
   103, '영업부', 2);
INSERT INTO s_dept VALUES (
   104, '영업부', 3);
INSERT INTO s_dept VALUES (
   105, '영업부', 4);
INSERT INTO s_dept VALUES (
   106, '영업부', 5);
INSERT INTO s_dept VALUES (
   110, '기획부', 1);
INSERT INTO s_dept VALUES (
   111, '기획부', 2);
INSERT INTO s_dept VALUES (
   112, '기획부', 3);
INSERT INTO s_dept VALUES (
   113, '기획부', 4);
INSERT INTO s_dept VALUES (
   118, '인사부', 1);
COMMIT;
