alter table ZXC_EMPLOYEE_DEPARTMENT_LINK add constraint FK_EMPDEP_ON_EMPLOYEE foreign key (EMPLOYEE_ID) references ZXC_EMPLOYEE(ID);
alter table ZXC_EMPLOYEE_DEPARTMENT_LINK add constraint FK_EMPDEP_ON_DEPARTMENT foreign key (DEPARTMENT_ID) references ZXC_DEPARTMENT(ID);
