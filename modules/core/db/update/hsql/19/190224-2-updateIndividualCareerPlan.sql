update ZXC_INDIVIDUAL_CAREER_PLAN set DATE_TO = current_date where DATE_TO is null ;
alter table ZXC_INDIVIDUAL_CAREER_PLAN alter column DATE_TO set not null ;
