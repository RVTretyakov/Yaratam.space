alter table ZXC_PROJECT add constraint FK_ZXC_PROJECT_ON_WORK_PLAN foreign key (WORK_PLAN_ID) references ZXC_WORK_PLAN(ID);
create index IDX_ZXC_PROJECT_ON_WORK_PLAN on ZXC_PROJECT (WORK_PLAN_ID);
