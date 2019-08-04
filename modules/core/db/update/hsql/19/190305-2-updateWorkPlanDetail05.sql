alter table ZXC_WORK_PLAN_DETAIL alter column PROJECTS_ID rename to PROJECTS_ID__U63382 ^
drop index IDX_ZXC_WORK_PLAN_DETAIL_ON_PROJECTS ;
alter table ZXC_WORK_PLAN_DETAIL drop constraint FK_ZXC_WORK_PLAN_DETAIL_ON_PROJECTS ;
-- alter table ZXC_WORK_PLAN_DETAIL add column PROJECT_ID varchar(36) ^
-- update ZXC_WORK_PLAN_DETAIL set PROJECT_ID = <default_value> ;
-- alter table ZXC_WORK_PLAN_DETAIL alter column PROJECT_ID set not null ;
alter table ZXC_WORK_PLAN_DETAIL add column PROJECT_ID varchar(36) not null ;
alter table ZXC_WORK_PLAN_DETAIL add column PLANNED_WORKS varchar(255) ;
alter table ZXC_WORK_PLAN_DETAIL add column PROJECTS_TASKS varchar(255) ;
alter table ZXC_WORK_PLAN_DETAIL add column EVALUATION_CRITERION varchar(255) ;
alter table ZXC_WORK_PLAN_DETAIL add column GRADE_ID integer ;
alter table ZXC_WORK_PLAN_DETAIL add column RESULT_EMPL varchar(255) ;
alter table ZXC_WORK_PLAN_DETAIL add column RESULT_CHIEF varchar(255) ;
