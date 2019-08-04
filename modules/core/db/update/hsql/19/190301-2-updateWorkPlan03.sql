alter table ZXC_WORK_PLAN alter column DATE_END rename to DATE_END__U99118 ^
update ZXC_WORK_PLAN set DATE_BEGIN = current_date where DATE_BEGIN is null ;
alter table ZXC_WORK_PLAN alter column DATE_BEGIN set not null ;
alter table ZXC_WORK_PLAN add column DATE_END date ;
