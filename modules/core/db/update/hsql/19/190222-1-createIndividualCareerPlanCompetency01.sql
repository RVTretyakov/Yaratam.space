create table ZXC_INDIVIDUAL_CAREER_PLAN_COMPETENCY (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    COMPETENCY_ID varchar(36),
    INDIVIDUAL_CAREER_PLAN_ID varchar(36),
    --
    primary key (ID)
);
