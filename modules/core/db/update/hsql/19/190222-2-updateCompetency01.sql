alter table ZXC_COMPETENCY add constraint FK_ZXC_COMPETENCY_ON_INDIVIDUAL_CAREER_PLAN foreign key (INDIVIDUAL_CAREER_PLAN_ID) references ZXC_INDIVIDUAL_CAREER_PLAN(ID);
create index IDX_ZXC_COMPETENCY_ON_INDIVIDUAL_CAREER_PLAN on ZXC_COMPETENCY (INDIVIDUAL_CAREER_PLAN_ID);
