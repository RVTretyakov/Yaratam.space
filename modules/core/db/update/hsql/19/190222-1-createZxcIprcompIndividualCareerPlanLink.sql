create table ZXC_IPRCOMP_INDIVIDUAL_CAREER_PLAN_LINK (
    IPRCOMP_ID varchar(36) not null,
    INDIVIDUAL_CAREER_PLAN_ID varchar(36) not null,
    primary key (IPRCOMP_ID, INDIVIDUAL_CAREER_PLAN_ID)
);
