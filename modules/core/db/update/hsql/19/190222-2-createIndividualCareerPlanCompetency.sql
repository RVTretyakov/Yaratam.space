alter table ZXC_INDIVIDUAL_CAREER_PLAN_COMPETENCY add constraint FK_ZXC_INDIVIDUAL_CAREER_PLAN_COMPETENCY_ON_COMPETENCY foreign key (COMPETENCY_ID) references ZXC_COMPETENCY(ID);
create index IDX_ZXC_INDIVIDUAL_CAREER_PLAN_COMPETENCY_ON_COMPETENCY on ZXC_INDIVIDUAL_CAREER_PLAN_COMPETENCY (COMPETENCY_ID);
