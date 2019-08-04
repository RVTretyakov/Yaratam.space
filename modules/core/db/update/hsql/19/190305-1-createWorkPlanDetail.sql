create table ZXC_WORK_PLAN_DETAIL (
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
    --
    primary key (ID)
);
