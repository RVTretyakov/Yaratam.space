create table ZXC_INDIVIDUAL_CAREER_PLAN (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    EMPLOYEE_ID varchar(36),
    ACTIVITY varchar(255),
    DATE_TO date,
    RESULT_EMPLOYEE varchar(255),
    RESULT_MENTOR varchar(255),
    --
    primary key (ID)
);
