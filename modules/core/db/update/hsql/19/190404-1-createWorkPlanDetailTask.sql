create table ZXC_WORK_PLAN_DETAIL_TASK (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    WORK_PLAN_ID varchar(36),
    TASK_NAME longvarchar,
    DATE_BEGIN date,
    DATE_END date,
    COMMENT_MENTOR longvarchar,
    RESULT_REPORT longvarchar,
    RESULT_GRADE_ID integer,
    --
    primary key (ID)
);
