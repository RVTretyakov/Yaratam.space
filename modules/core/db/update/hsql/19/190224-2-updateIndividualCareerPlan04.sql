alter table ZXC_INDIVIDUAL_CAREER_PLAN alter column ACTIVITY rename to ACTIVITY__U19183 ^
alter table ZXC_INDIVIDUAL_CAREER_PLAN add column GOAL varchar(255) ;
-- update ZXC_INDIVIDUAL_CAREER_PLAN set EMPLOYEE_ID = <default_value> where EMPLOYEE_ID is null ;
alter table ZXC_INDIVIDUAL_CAREER_PLAN alter column EMPLOYEE_ID set not null ;
