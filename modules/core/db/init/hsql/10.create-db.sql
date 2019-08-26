-- begin ZXC_EMPLOYEE
create table ZXC_EMPLOYEE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    DTYPE varchar(31),
    --
    FIO varchar(255),
    CUBA_USER_ID_ID varchar(36),
    CHIEF_ID varchar(36),
    USER_ROLE_ID varchar(36),
    DEPARTMENT_ID varchar(36),
    TEAM_LEAD_ID varchar(36),
    POSITION_ID varchar(36),
    --
    primary key (ID)
)^
-- end ZXC_EMPLOYEE

-- begin ZXC_DEPARTMENT
create table ZXC_DEPARTMENT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    --
    primary key (ID)
)^
-- end ZXC_DEPARTMENT
-- begin ZXC_INDIVIDUAL_CAREER_PLAN
create table ZXC_INDIVIDUAL_CAREER_PLAN (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    EMPLOYEE_ID varchar(36) not null,
    DATE_TO date not null,
    GOAL longvarchar,
    GRADE_ID integer,
    RESULT_EMPLOYEE longvarchar,
    RESULT_MENTOR longvarchar,
    --
    primary key (ID)
)^
-- end ZXC_INDIVIDUAL_CAREER_PLAN
-- begin ZXC_GRADE
create table ZXC_GRADE (
    ID integer not null,
    UUID varchar(36),
    --
    NAME varchar(1) not null,
    DESCRIPTION varchar(2000),
    --
    primary key (ID)
)^
-- end ZXC_GRADE
-- begin ZXC_WORK_PLAN
create table ZXC_WORK_PLAN (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    EMPLOYEE_ID varchar(36) not null,
    TASKS longvarchar,
    MENTOR_TARGET_COMMENT longvarchar,
    EMPLOYEE_REPORT longvarchar,
    MENTOR_COMMENT longvarchar,
    GRADE_ID integer,
    MY_GRADE_ID integer,
    PLAN_QUARTER_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end ZXC_WORK_PLAN
-- begin ZXC_COMPETENCY
create table ZXC_COMPETENCY (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(2000) not null,
    DESCRIPTION longvarchar,
    EMPLOYEE_MASTER_ID varchar(36),
    --
    primary key (ID)
)^
-- end ZXC_COMPETENCY

-- begin ZXC_IPRDETAIL
create table ZXC_IPRDETAIL (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    COMPETENCY_ID varchar(36) not null,
    GRADE_ID integer,
    GOAL longvarchar,
    ACTIVITY longvarchar,
    EVALUATION_CRITERION longvarchar,
    RESULT_EMPL longvarchar,
    RESULT_MENTOR longvarchar,
    GOAL_COMMENT_MENTOR longvarchar,
    INDIVIDUAL_CAREER_PLAN_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end ZXC_IPRDETAIL

-- begin ZXC_POSITION
create table ZXC_POSITION (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    --
    primary key (ID)
)^
-- end ZXC_POSITION
-- begin ZXC_USER_ROLE
create table ZXC_USER_ROLE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    --
    primary key (ID)
)^
-- end ZXC_USER_ROLE
-- begin ZXC_PROJECT
create table ZXC_PROJECT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    --
    primary key (ID)
)^
-- end ZXC_PROJECT

-- begin ZXC_WORK_PLAN_DETAIL
create table ZXC_WORK_PLAN_DETAIL (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    WORK_PLAN_ID varchar(36),
    PROJECT_ID varchar(36) not null,
    PLANNED_WORKS longvarchar,
    PROJECTS_TASKS longvarchar,
    EVALUATION_CRITERION longvarchar,
    GRADE_ID integer,
    RESULT_EMPL longvarchar,
    RESULT_CHIEF longvarchar,
    --
    primary key (ID)
)^
-- end ZXC_WORK_PLAN_DETAIL
-- begin ZXC_WORK_PLAN_DETAIL_TASK
create table ZXC_WORK_PLAN_DETAIL_TASK (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    WORK_PLAN_ID varchar(36),
    TASK_NAME longvarchar,
    DATE_BEGIN date,
    DATE_END date,
    COMMENT_MENTOR longvarchar,
    RESULT_REPORT longvarchar,
    RESULT_GRADE_ID integer,
    --
    primary key (ID)
)^
-- end ZXC_WORK_PLAN_DETAIL_TASK
-- begin ZXC_QUARTERS_DICT
create table ZXC_QUARTERS_DICT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    --
    primary key (ID)
)^
-- end ZXC_QUARTERS_DICT
-- begin ZXC_FEEDBACK
create table ZXC_FEEDBACK (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    MESSAGE longvarchar not null,
    EMPLOYEE_ID varchar(36) not null,
    SIGNATURE varchar(255),
    CHIEF_COMMENT longvarchar,
    --
    primary key (ID)
)^
-- end ZXC_FEEDBACK
-- begin ZXC_EMPLOYEE_PROFILE
create table ZXC_EMPLOYEE_PROFILE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    USERNAME varchar(255) not null,
    NICKNAME varchar(255) not null,
    FIRST_NAME varchar(255),
    LAST_NAME varchar(255),
    DISPLAY_NAME varchar(50),
    AVATAR_ID varchar(36),
    BIOGRAPHICAL_INFO varchar(1023),
    WEBSITE varchar(255),
    EMAIL varchar(255),
    HASH_PASSWORD longvarchar not null,
    IS_HR_MANAGER boolean,
    IS_RECRUITER boolean,
    IS_CRM_MANAGER boolean,
    IS_CRM_AGENT boolean,
    IS_ACCOUNTING_MANAGER boolean,
    IS_CHOOSING_NOTIFICATIONS boolean,
    IS_CHOOSING_VISUAL_EDITOR boolean,
    IS_CHOOSING_SYNTAX_HIGHLIGHTING boolean,
    ADMIN_COLOR_SCHEME varchar(50),
    IS_CHOOSING_KEYBOARD_STRUCTS boolean,
    IS_CHOOSING_TOOLBAR boolean,
    --
    primary key (ID)
)^
-- end ZXC_EMPLOYEE_PROFILE
