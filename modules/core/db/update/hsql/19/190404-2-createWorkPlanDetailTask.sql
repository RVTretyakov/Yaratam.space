alter table ZXC_WORK_PLAN_DETAIL_TASK add constraint FK_ZXC_WORK_PLAN_DETAIL_TASK_ON_WORK_PLAN foreign key (WORK_PLAN_ID) references ZXC_WORK_PLAN(ID);
alter table ZXC_WORK_PLAN_DETAIL_TASK add constraint FK_ZXC_WORK_PLAN_DETAIL_TASK_ON_RESULT_GRADE foreign key (RESULT_GRADE_ID) references ZXC_GRADE(ID);
create index IDX_ZXC_WORK_PLAN_DETAIL_TASK_ON_WORK_PLAN on ZXC_WORK_PLAN_DETAIL_TASK (WORK_PLAN_ID);
create index IDX_ZXC_WORK_PLAN_DETAIL_TASK_ON_RESULT_GRADE on ZXC_WORK_PLAN_DETAIL_TASK (RESULT_GRADE_ID);
