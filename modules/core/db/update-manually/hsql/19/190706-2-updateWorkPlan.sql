-- update ZXC_WORK_PLAN set EMPLOYEE_ID = <default_value> where EMPLOYEE_ID is null ;
alter table ZXC_WORK_PLAN alter column EMPLOYEE_ID set not null ;
-- update ZXC_WORK_PLAN set PLAN_QUARTER_ID = <default_value> where PLAN_QUARTER_ID is null ;
alter table ZXC_WORK_PLAN alter column PLAN_QUARTER_ID set not null ;
