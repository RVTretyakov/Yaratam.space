create table ZXC_FEEDBACK (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    MESSAGE longvarchar not null,
    SIGNATURE varchar(255) not null,
    CHIEF_COMMENT longvarchar,
    --
    primary key (ID)
);
