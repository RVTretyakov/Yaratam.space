alter table ZXC_WORK_PLAN add constraint FK_ZXC_WORK_PLAN_ON_GRADE foreign key (GRADE_ID) references ZXC_GRADE(ID);
create index IDX_ZXC_WORK_PLAN_ON_GRADE on ZXC_WORK_PLAN (GRADE_ID);
