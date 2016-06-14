create table 은행A(
계좌번호 number, 금액 number
)

insert into 은행A values(1234,20000)

create table 은행B(
계좌번호 number, 금액 number
)

insert into 은행B values(9999,5000)

update 은행A set 금액 = 금액 - 10000 where 계좌번호 = 1234

update 은행B set 금액 = 금액 + 10000 where 계좌번호 = 9