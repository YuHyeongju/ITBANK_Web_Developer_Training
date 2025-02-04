drop table reply2 cascade CONSTRAINTS purge;

create table reply2(
    idx            number           generated as identity primary key,
    board_idx      number           references board2(idx),
    writer         varchar2(100)    REFERENCES member(userid) on delete set null,
    content        varchar2(2000)   not null,
    writeDate      date             default sysdate,
    deleted        number           check(deleted between 0 and 1),
    
    parent_idx     number           default 0,  -- 참조하는 댓글 번호
    reply_depth    number           default 0   -- 대댓의 깊이
        
    

);

desc reply2;
select * from reply2 order by idx;
select * from reply2 where board_idx = 1562
    start with parent_idx = 0
    connect by prior idx = parent_idx
    order SIBLINGS by idx;
