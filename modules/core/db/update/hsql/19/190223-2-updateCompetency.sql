alter table ZXC_COMPETENCY alter column IPR_ID rename to IPR_ID__U09589 ^
alter table ZXC_COMPETENCY alter column IPR_ID__U09589 set null ;
drop index IDX_ZXC_COMPETENCY_ON_IPR ;
alter table ZXC_COMPETENCY drop constraint FK_ZXC_COMPETENCY_ON_IPR ;
