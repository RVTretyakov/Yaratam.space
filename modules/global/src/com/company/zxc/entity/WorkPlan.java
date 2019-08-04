package com.company.zxc.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.haulmont.cuba.core.entity.StandardEntity;
import java.util.List;
import javax.persistence.OneToMany;
import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import javax.persistence.Lob;
import com.haulmont.chile.core.annotations.NumberFormat;
import javax.persistence.UniqueConstraint;

@Table(name = "ZXC_WORK_PLAN", uniqueConstraints = {
    @UniqueConstraint(name = "IDX_ZXC_WORK_PLAN_UNQ", columnNames = {"EMPLOYEE_ID"})
})
@Entity(name = "zxc$WorkPlan")
public class WorkPlan extends StandardEntity {
    private static final long serialVersionUID = 5879894931041748173L;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "workPlan")
    protected List<WorkPlanDetail> workPlanDetail;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "workPlan")
    protected List<WorkPlanDetailTask> workPlanDetailTasks;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "EMPLOYEE_ID")
    protected Employee employee;

    @Lob
    @Column(name = "TASKS")
    protected String tasks;

    @Lob
    @Column(name = "MENTOR_TARGET_COMMENT")
    protected String mentorTargetComment;

    @Lob
    @Column(name = "EMPLOYEE_REPORT")
    protected String employeeReport;

    @Lob
    @Column(name = "MENTOR_COMMENT")
    protected String mentorComment;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "GRADE_ID")
    protected Grade grade;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MY_GRADE_ID")
    protected Grade my_grade;


    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PLAN_QUARTER_ID")
    protected QuartersDict plan_quarter;

    public void setPlan_quarter(QuartersDict plan_quarter) {
        this.plan_quarter = plan_quarter;
    }

    public QuartersDict getPlan_quarter() {
        return plan_quarter;
    }



    public void setWorkPlanDetailTasks(List<WorkPlanDetailTask> workPlanDetailTasks) {
        this.workPlanDetailTasks = workPlanDetailTasks;
    }

    public List<WorkPlanDetailTask> getWorkPlanDetailTasks() {
        return workPlanDetailTasks;
    }



    public void setMy_grade(Grade my_grade) {
        this.my_grade = my_grade;
    }

    public Grade getMy_grade() {
        return my_grade;
    }


    public void setWorkPlanDetail(List<WorkPlanDetail> workPlanDetail) {
        this.workPlanDetail = workPlanDetail;
    }

    public List<WorkPlanDetail> getWorkPlanDetail() {
        return workPlanDetail;
    }


    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }





    public void setEmployeeReport(String employeeReport) {
        this.employeeReport = employeeReport;
    }

    public String getEmployeeReport() {
        return employeeReport;
    }

    public void setMentorComment(String mentorComment) {
        this.mentorComment = mentorComment;
    }

    public String getMentorComment() {
        return mentorComment;
    }


    public void setMentorTargetComment(String mentorTargetComment) {
        this.mentorTargetComment = mentorTargetComment;
    }

    public String getMentorTargetComment() {
        return mentorTargetComment;
    }


    public void setTasks(String tasks) {
        this.tasks = tasks;
    }

    public String getTasks() {
        return tasks;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public Grade getGrade() {
        return grade;
    }




}