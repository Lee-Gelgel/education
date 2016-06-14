CREATE TABLE s_dept
(id                         NUMBER(7)
   CONSTRAINT s_dept_id_nn NOT NULL,
 name                       VARCHAR2(25)
   CONSTRAINT s_dept_name_nn NOT NULL,
 region_id                  NUMBER(7),
     CONSTRAINT s_dept_id_pk PRIMARY KEY (id),
     CONSTRAINT s_dept_name_region_id_uk UNIQUE (name, region_id));

INSERT INTO s_dept VALUES (
   101, '�ѹ���', 1);
INSERT INTO s_dept VALUES (
   102, '������', 1);
INSERT INTO s_dept VALUES (
   103, '������', 2);
INSERT INTO s_dept VALUES (
   104, '������', 3);
INSERT INTO s_dept VALUES (
   105, '������', 4);
INSERT INTO s_dept VALUES (
   106, '������', 5);
INSERT INTO s_dept VALUES (
   110, '��ȹ��', 1);
INSERT INTO s_dept VALUES (
   111, '��ȹ��', 2);
INSERT INTO s_dept VALUES (
   112, '��ȹ��', 3);
INSERT INTO s_dept VALUES (
   113, '��ȹ��', 4);
INSERT INTO s_dept VALUES (
   118, '�λ��', 1);
COMMIT;
