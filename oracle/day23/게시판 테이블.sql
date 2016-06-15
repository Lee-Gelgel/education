--board테이블 생성하기 
CREATE TABLE BOARD (
  boardSeq        NUMBER (10)   NOT NULL,
  boardSubject    VARCHAR2 (255),
  boardWriter     VARCHAR2 (100),
  boardContents   VARCHAR2 (4000),
  boardDate       DATE,
  boardPassword   VARCHAR2 (20),
  boardViewCount  NUMBER (6));

ALTER TABLE BOARD
 ADD CONSTRAINT BOARD_PK
  PRIMARY KEY (boardSeq);
  
--boardSubject에 index생성하기
Create Index idx_boardSubject on BOARD(boardSubject);

select   a.index_name, a.table_name,  b.column_name, 	b.column_position 
from user_indexes a, user_ind_columns b
where a.index_name = b.index_name
and a.table_name='BOARD';

select * from user_indexes where table_name = 'BOARD'
select * from user_ind_columns where table_name = 'BOARD'
 
  
--boardSeq에 sequence생성하기 
  create sequence boardSeq;
  
  insert into board values (boardSeq.nextval, 'boardSubject1','boardWriter1','boardContents1',sysdate,'1',1)
  insert into board values (boardSeq.nextval, 'boardSubject2','boardWriter2','boardContents2',sysdate,'1',1)
  insert into board values (boardSeq.nextval, 'boardSubject3','boardWriter3','boardContents3',sysdate,'1',1)
  insert into board values (boardSeq.nextval, 'boardSubject4','boardWriter4','boardContents4',sysdate,'1',1)
  
  select * from board