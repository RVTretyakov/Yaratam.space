alter table ZXC_WORK_PLAN alter column PLAN_QUARTER rename to PLAN_QUARTER__U90435 ^
alter table ZXC_WORK_PLAN alter column PLAN_QUARTER__U90435 set null ;
alter table ZXC_WORK_PLAN add column PLAN_QUARTER_ integer ^
update ZXC_WORK_PLAN set PLAN_QUARTER_ = 0 where PLAN_QUARTER_ is null ;
alter table ZXC_WORK_PLAN alter column PLAN_QUARTER_ set not null ;
alter table ZXC_WORK_PLAN add column PLAN_QUARTER_ID varchar(36) ;
