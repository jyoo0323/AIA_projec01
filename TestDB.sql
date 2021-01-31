create table USER (
ID VARCHAR2(20),
PWD VARCHAR2(20)
);

CREATE TABLE ROOM (
SENDER VARCHAR2(20),
RECIEVER VARCHAR2(20),
CONTENT VARCHAR2(8000)
);

insert into ROOM values('User A', 'User B', 'what is better? Java? or Python?');
insert into USER values('User A', '1234');
insert into USER values('User B', '5678');

SELECT * FROM ROOM;
SELECT * FROM USER;

SELECT * FROM USER WHERE ID='User A' AND PWD='1234';