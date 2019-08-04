create table ZXC_IPRCOMP_COMPETENCY_LINK (
    IPRCOMP_ID varchar(36) not null,
    COMPETENCY_ID varchar(36) not null,
    primary key (IPRCOMP_ID, COMPETENCY_ID)
);
