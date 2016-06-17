--�ֹ�����Ʈ.....�Ϻ� ��ǰ�� �ֹ�����
CREATE TABLE ORDER_LIST (
	ORDER_DATE CHAR(8) NOT NULL,
	PRODUCT VARCHAR2(10) NOT NULL,
	QTY NUMBER NOT NULL,
	AMOUNT NUMBER NOT NULL);

--���ں� �Ǹŷ�
CREATE TABLE SALES_PER_DATE (
	SALE_DATE CHAR(8) NOT NULL,
	PRODUCT VARCHAR2(10) NOT NULL,
	QTY NUMBER NOT NULL,
	 AMOUNT NUMBER NOT NULL);

CREATE OR REPLACE Trigger SUMMARY_SALES
	AFTER INSERT
 		ON ORDER_LIST
 			FOR EACH ROW
DECLARE
 o_date ORDER_LIST.order_date%TYPE;
 o_prod ORDER_LIST.product%TYPE;
BEGIN
  o_date := :NEW.order_date;
  o_prod := :NEW.product;
  
  UPDATE SALES_PER_DATE
  SET qty = qty + :NEW.qty,
  	amount = amount + :NEW.amount
  WHERE sale_date = o_date
   AND product = o_prod;
 
 if SQL%NOTFOUND then
   INSERT INTO SALES_PER_DATE
   VALUES(o_date, o_prod, :NEW.qty, :NEW.amount);
 end if;
 
END;
/

select * from ORDER_LIST 
select * from SALES_PER_DATE 
INSERT INTO ORDER_LIST VALUES('20120901', 'MONOPACK', 10, 300000);
INSERT INTO ORDER_LIST VALUES('20160617', 'gelgel', 2, 300000);
commit;


INSERT INTO ORDER_LIST VALUES('20120901','MULTIPACK',10,300000);
select~~
rollback;



----------------------------------

drop trigger REFUSE_99;
CREATE OR REPLACE TRIGGER REFUSE_99
    BEFORE  UPDATE OR DELETE OR INSERT ON EMP  
    FOR EACH ROW
 DECLARE
    s_msg   VARCHAR2(100) := '';
BEGIN
   IF UPDATING THEN
      IF :OLD.EMPNO = '99' THEN
          s_msg := '99 ����� ���� �� �� �����ϴ�.!';
          raise_application_error( -20001, s_msg);
      END IF;
   END IF;
   IF DELETING THEN
      IF :OLD.EMPNO = '99' THEN
         s_msg := '99 ����� ���� �� �� �����ϴ�.!';
         RAISE_APPLICATION_ERROR( -20002, s_msg);
      END IF;
   END IF;
   IF INSERTING THEN
      IF :NEW.EMPNO = '99' THEN
         s_msg := '99 ����� �Է� �� �� �����ϴ�.!';
         raise_application_error( -20003, s_msg);
      END IF;
   END IF;
END;
/

INSERT INTO EMP(EMPNO, ENAME) VALUES('99', 'TRIGGER');







 
