alter table ZXC_IPRDETAIL alter column INDIVIDUAL_CAREER_PLAN_ID rename to INDIVIDUAL_CAREER_PLAN_ID__U91307 ^
drop index IDX_ZXC_IPRDETAIL_ON_INDIVIDUAL_CAREER_PLAN ;
alter table ZXC_IPRDETAIL drop constraint FK_ZXC_IPRDETAIL_ON_INDIVIDUAL_CAREER_PLAN ;
