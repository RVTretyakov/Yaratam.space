alter table ZXC_PROJECT alter column WORK_PLAN_ID rename to WORK_PLAN_ID__U37156 ^
drop index IDX_ZXC_PROJECT_ON_WORK_PLAN ;
alter table ZXC_PROJECT drop constraint FK_ZXC_PROJECT_ON_WORK_PLAN ;
