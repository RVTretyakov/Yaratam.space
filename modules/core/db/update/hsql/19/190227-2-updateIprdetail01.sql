alter table ZXC_IPRDETAIL add constraint FK_ZXC_IPRDETAIL_ON_GRADE foreign key (GRADE_ID) references ZXC_GRADE(ID);
create index IDX_ZXC_IPRDETAIL_ON_GRADE on ZXC_IPRDETAIL (GRADE_ID);
