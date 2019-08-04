alter table ZXC_WORK_PLAN add constraint FK_ZXC_WORK_PLAN_ON_MY_GRADE foreign key (MY_GRADE_ID) references ZXC_GRADE(ID);
create index IDX_ZXC_WORK_PLAN_ON_MY_GRADE on ZXC_WORK_PLAN (MY_GRADE_ID);
