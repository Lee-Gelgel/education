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
COMMENT ON COLUMN s_emp.salary IS 'S_EMP ���̺��� �޿��� ������ õ����';

alter session set nls_date_language=AMERICAN;

alter session set nls_date_format='DD-MON-RR';

INSERT INTO s_emp VALUES (
  100, '��X_Y����', 'sky98',
   '03-MAR-90', NULL, '����',
   118, 5000, NULL);
INSERT INTO s_emp VALUES (
   222, '�ո�2', '2xxsig2',
   '08-MAR-90', 1, '��ȹ����',
   110, 3000, NULL);
INSERT INTO s_emp VALUES (
   3, '������', 'ch21175',
   '17-JUN-91', 1, '��������',
   102, 3500, NULL);
INSERT INTO s_emp VALUES (
   4, '����ȫ', 'mquickto',
   '07-APR-90', 1, '�ѹ�����',
   101, 3000, NULL);
INSERT INTO s_emp VALUES (
   5, '��ɼ�', 'aropebur',
   '04-MAR-90', 1, '�λ����',
   118, 3200, NULL);
INSERT INTO s_emp VALUES (
   6, '������', 'murguhar',
   '18-JAN-91', 2, '����',
   110, 2400, NULL);
INSERT INTO s_emp VALUES (
   7, '������', 'enchu',
   '14-MAY-90', 2, '����',
   111, 2400, NULL);
INSERT INTO s_emp VALUES (
   8, '�ű��', 'bbiri',
   '07-APR-90', 2, '����',
   112, 2100, NULL);
INSERT INTO s_emp VALUES (
   9, '�̻���', 'acatchpo',
   '09-FEB-92', 2, '����',
   113, 2300, NULL);
INSERT INTO s_emp VALUES (
   10, '�ּ�ö', 'mhavel',
   '27-FEB-91', 2, '����',
   113, 2300, NULL);
INSERT INTO s_emp VALUES (
   11, '������', 'cmagee',
   '14-MAY-90', 3, '������ǥ�̻�',
   102, 2450, 10);
INSERT INTO s_emp VALUES (
   12, '������', 'hgiljum',
   '18-JAN-92', 3, '������ǥ�̻�',
   103, 2500, 12.5);
INSERT INTO s_emp VALUES (
   13, '�輮��', 'ysedeghi',
   '18-FEB-91', 3, '������ǥ�̻�',
   104, 2650, 10);
INSERT INTO s_emp VALUES (
   14, '�ڼ���', 'mnguyen',
   '22-JAN-92', 3, '������ǥ�̻�',
   105, 2650, 15);
INSERT INTO s_emp VALUES (
   15, '������', 'adumas',
   '09-OCT-91', 3, '������ǥ�̻�',
   106, 2400, 17.5);
INSERT INTO s_emp VALUES (
   16, '�̱�ö', 'emaduro',
   '07-FEB-92', 6, '���',
   110, 2400, NULL);
INSERT INTO s_emp VALUES (
   17, '������', 'gsmith',
   '08-MAR-90', 6, '���',
   110, 940, NULL);
INSERT INTO s_emp VALUES (
   18, '������', 'anozaki',
   '09-FEB-91', 7, '���',
   111, 1200, NULL);
INSERT INTO s_emp VALUES (
   19, '��âȯ', 'vpatel',
   '06-AUG-91', 7, '���',
   111, 795, NULL);
INSERT INTO s_emp VALUES (
   20, '������', 'cnewman',
   '21-JUL-91', 8, '���',
   112, 750, NULL);
INSERT INTO s_emp VALUES (
   21, '����ö','amarkari',
   '26-MAY-91', 8, '���',
   112, 850, NULL);
INSERT INTO s_emp VALUES (
   22, '������', 'echang',
   '30-NOV-90', 9, '���',
   113, 800, NULL);
INSERT INTO s_emp VALUES (
   23, '������', 'rpatel',
   '17-OCT-90', 9, '���',
   106, 795, NULL);
INSERT INTO s_emp VALUES (
   24, '������', 'bdancs',
   '17-MAR-91', 10, '���',
   113, 860, NULL);
INSERT INTO s_emp VALUES (
   25, '�̿�ȣ', 'sschwart',
   '09-MAY-91', 10, '���',
   113, 1100, NULL);
COMMIT;