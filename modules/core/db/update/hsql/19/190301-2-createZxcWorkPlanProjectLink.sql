alter table ZXC_WORK_PLAN_PROJECT_LINK add constraint FK_WORPLAPRO_ON_WORK_PLAN foreign key (WORK_PLAN_ID) references ZXC_WORK_PLAN(ID);
alter table ZXC_WORK_PLAN_PROJECT_LINK add constraint FK_WORPLAPRO_ON_PROJECT foreign key (PROJECT_ID) references ZXC_PROJECT(ID);
