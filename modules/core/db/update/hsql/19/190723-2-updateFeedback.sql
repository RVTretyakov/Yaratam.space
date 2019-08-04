-- alter table ZXC_FEEDBACK add column EMPLOYEE_ID varchar(36) ^
-- update ZXC_FEEDBACK set EMPLOYEE_ID = <default_value> ;
-- alter table ZXC_FEEDBACK alter column EMPLOYEE_ID set not null ;
alter table ZXC_FEEDBACK add column EMPLOYEE_ID varchar(36) not null ;
