create table ZXC_EMPLOYEE_DEPARTMENT_LINK (
    EMPLOYEE_ID varchar(36) not null,
    DEPARTMENT_ID varchar(36) not null,
    primary key (EMPLOYEE_ID, DEPARTMENT_ID)
);
