alter table ZXC_COMPETENCY alter column INDIVIDUAL_CAREER_PLAN_ID rename to INDIVIDUAL_CAREER_PLAN_ID__U48694 ^
drop index IDX_ZXC_COMPETENCY_ON_INDIVIDUAL_CAREER_PLAN ;
alter table ZXC_COMPETENCY drop constraint FK_ZXC_COMPETENCY_ON_INDIVIDUAL_CAREER_PLAN ;