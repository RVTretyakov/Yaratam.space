alter table ZXC_PLAN add constraint FK_ZXC_PLAN_ON_EMPL foreign key (EMPL_ID) references ZXC_EMPLOYEE(ID);
create index IDX_ZXC_PLAN_ON_EMPL on ZXC_PLAN (EMPL_ID);
