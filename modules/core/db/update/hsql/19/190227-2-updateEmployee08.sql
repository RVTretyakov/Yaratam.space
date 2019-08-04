alter table ZXC_EMPLOYEE add constraint FK_ZXC_EMPLOYEE_ON_CHIEF foreign key (CHIEF_ID) references ZXC_EMPLOYEE(ID);
create index IDX_ZXC_EMPLOYEE_ON_CHIEF on ZXC_EMPLOYEE (CHIEF_ID);
