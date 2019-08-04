create table ZXC_IPRDETAIL (
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
    EVALUATION_CRITERION varchar(255),
    --
    primary key (ID)
);
