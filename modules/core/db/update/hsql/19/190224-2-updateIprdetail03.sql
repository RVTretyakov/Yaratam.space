-- update ZXC_IPRDETAIL set COMPETENCY_ID = <default_value> where COMPETENCY_ID is null ;
alter table ZXC_IPRDETAIL alter column COMPETENCY_ID set not null ;
