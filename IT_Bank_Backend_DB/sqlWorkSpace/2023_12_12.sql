drop sequence mcdonald_seq;
drop table mcdonald purge;

create sequence mcdonald_seq
    start with 1
    maxvalue 99999
    increment by 1
    nocycle
    nocache;

create table mcdonald (
    idx		number		default mcdonald_seq.nextval primary key,
    category	varchar2(50)	check(category in ('����', '����')),
    name	varchar2(100)	not null,
    price	number		check(price >= 0) not null,
    memo	varchar2(2000)	not null,
    imgName	varchar2(200)	not null
);



select * from mcdonald;