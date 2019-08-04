create table ZXC_WORK_PLAN_PROJECT_LINK (
    WORK_PLAN_ID varchar(36) not null,
    PROJECT_ID varchar(36) not null,
    primary key (WORK_PLAN_ID, PROJECT_ID)
);
