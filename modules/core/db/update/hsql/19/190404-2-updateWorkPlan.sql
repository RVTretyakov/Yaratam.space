alter table ZXC_WORK_PLAN add column PLAN_YEAR integer ^
update ZXC_WORK_PLAN set PLAN_YEAR = 0 where PLAN_YEAR is null ;
alter table ZXC_WORK_PLAN alter column PLAN_YEAR set not null ;
alter table ZXC_WORK_PLAN add column PLAN_QUARTER integer ^
update ZXC_WORK_PLAN set PLAN_QUARTER = 0 where PLAN_QUARTER is null ;
alter table ZXC_WORK_PLAN alter column PLAN_QUARTER set not null ;
