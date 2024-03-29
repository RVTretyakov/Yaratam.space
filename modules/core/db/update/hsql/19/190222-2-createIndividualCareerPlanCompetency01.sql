alter table ZXC_INDIVIDUAL_CAREER_PLAN_COMPETENCY add constraint FK_ZXC_INDIVIDUAL_CAREER_PLAN_COMPETENCY_ON_COMPETENCY foreign key (COMPETENCY_ID) references ZXC_COMPETENCY(ID);
alter table ZXC_INDIVIDUAL_CAREER_PLAN_COMPETENCY add constraint FK_ZXC_INDIVIDUAL_CAREER_PLAN_COMPETENCY_ON_INDIVIDUAL_CAREER_PLAN foreign key (INDIVIDUAL_CAREER_PLAN_ID) references ZXC_INDIVIDUAL_CAREER_PLAN(ID);
create index IDX_ZXC_INDIVIDUAL_CAREER_PLAN_COMPETENCY_ON_COMPETENCY on ZXC_INDIVIDUAL_CAREER_PLAN_COMPETENCY (COMPETENCY_ID);
create index IDX_ZXC_INDIVIDUAL_CAREER_PLAN_COMPETENCY_ON_INDIVIDUAL_CAREER_PLAN on ZXC_INDIVIDUAL_CAREER_PLAN_COMPETENCY (INDIVIDUAL_CAREER_PLAN_ID);
