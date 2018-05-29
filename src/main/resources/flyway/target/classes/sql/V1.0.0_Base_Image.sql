CREATE TABLE CONTACT (
  ID INT NOT NULL
, PUBLICID VARCHAR2(5) NOT NULL
, FIRSTNAME VARCHAR2(15)
, LASTNAME VARCHAR2(20)
, PHONEIND VARCHAR2(4)
, PHONENUM INT
, CONSTRAINT CONTACT_PK PRIMARY KEY (ID) ENABLE
);


Insert into contact (ID, PUBLICID, FIRSTNAME, LASTNAME, PHONEIND, PHONENUM)
	Values (1, 1, 'AfirstAname', 'AlastAname', '0033', 1111111111);
Insert into contact (ID, PUBLICID, FIRSTNAME, LASTNAME, PHONEIND, PHONENUM)
	Values (2, 2, 'BfirstBname', 'BlastBname', '0033',2222222222);
Insert into contact (ID, PUBLICID, FIRSTNAME, LASTNAME, PHONEIND, PHONENUM)
	Values (3, 3, 'CfirstCname', 'ClastCname', '0033', 3333333333);
Insert into contact (ID, PUBLICID, FIRSTNAME, LASTNAME, PHONEIND, PHONENUM)
	Values (4, 4, 'DfirstDname', 'DlastDname', '0033', 4444444444);

commit;