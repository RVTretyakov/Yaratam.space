alter table ZXC_WORK_PLAN add constraint FK_ZXC_WORK_PLAN_ON_EMPLOYEE foreign key (EMPLOYEE_ID) references ZXC_EMPLOYEE(ID);
create index IDX_ZXC_WORK_PLAN_ON_EMPLOYEE on ZXC_WORK_PLAN (EMPLOYEE_ID);
