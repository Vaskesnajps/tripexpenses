

 drop sequence businesstrips_seq;
 drop sequence bill_seq;
 drop sequence tripbills_seq;
 drop sequence employees_seq;
 drop sequence locations_seq;
 drop sequence authorities_seq;
drop sequence user_seq;

       
 

insert into employees values(0,'Stefan Vasic','stefan.vasic1987@gmail',123343232,32233,1);
insert into users values('StefanV87','admin',1,0,0);
insert into authorities values('admin',0,'StefanV87');

 CREATE SEQUENCE authorities_seq
  minvalue 1
  maxvalue 100000
 START WITH     1
 INCREMENT BY   1
nocache
 NOCYCLE;
  CREATE SEQUENCE locations_seq
 minvalue 1
  maxvalue 100000
 START WITH     1
 INCREMENT BY   1
nocache
 NOCYCLE;
 CREATE SEQUENCE employees_seq
  minvalue 1
  maxvalue 100000
 START WITH     1
 INCREMENT BY   1
nocache
 NOCYCLE;
 
  CREATE SEQUENCE businesstrips_seq
  minvalue 1
  maxvalue 100000
 START WITH     1
 INCREMENT BY   1
nocache
 NOCYCLE;

CREATE SEQUENCE tripbills_seq
  minvalue 1
  maxvalue 100000
 START WITH     1
 INCREMENT BY   1
nocache
 NOCYCLE;

CREATE SEQUENCE bill_seq
  minvalue 1
  maxvalue 100000
 START WITH     1
 INCREMENT BY   1
nocache
 NOCYCLE;
 
 CREATE SEQUENCE user_seq
  minvalue 1
  maxvalue 100000
   START WITH    1
 INCREMENT BY   1
nocache
 NOCYCLE;
