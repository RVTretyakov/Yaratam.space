-- alter table ZXC_IPRDETAIL add column INDIVIDUAL_CAREER_PLAN_ID varchar(36) ^
-- update ZXC_IPRDETAIL set INDIVIDUAL_CAREER_PLAN_ID = <default_value> ;
-- alter table ZXC_IPRDETAIL alter column INDIVIDUAL_CAREER_PLAN_ID set not null ;
alter table ZXC_IPRDETAIL add column INDIVIDUAL_CAREER_PLAN_ID varchar(36) not null ;
