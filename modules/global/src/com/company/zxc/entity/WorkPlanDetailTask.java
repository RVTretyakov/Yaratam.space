package com.company.zxc.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|taskName")
@Table(name = "ZXC_WORK_PLAN_DETAIL_TASK")
@Entity(name = "zxc$WorkPlanDetailTask")
public class WorkPlanDetailTask extends StandardEntity {
    private static final long serialVersionUID = 8950712336713438566L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "WORK_PLAN_ID")
    protected WorkPlan workPlan;

    @Lob
    @Column(name = "TASK_NAME")
    protected String taskName;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATE_BEGIN")
    protected Date date_begin;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATE_END")
    protected Date date_end;

    @Lob
    @Column(name = "COMMENT_MENTOR")
    protected String comment_mentor;

    @Lob
    @Column(name = "RESULT_REPORT")
    protected String result_report;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RESULT_GRADE_ID")
    protected Grade result_grade;

    public Grade getResult_grade() {
        return result_grade;
    }

    public void setResult_grade(Grade result_grade) {
        this.result_grade = result_grade;
    }


    public void setWorkPlan(WorkPlan workPlan) {
        this.workPlan = workPlan;
    }

    public WorkPlan getWorkPlan() {
        return workPlan;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setDate_begin(Date date_begin) {
        this.date_begin = date_begin;
    }

    public Date getDate_begin() {
        return date_begin;
    }

    public void setDate_end(Date date_end) {
        this.date_end = date_end;
    }

    public Date getDate_end() {
        return date_end;
    }

    public void setComment_mentor(String comment_mentor) {
        this.comment_mentor = comment_mentor;
    }

    public String getComment_mentor() {
        return comment_mentor;
    }

    public void setResult_report(String result_report) {
        this.result_report = result_report;
    }

    public String getResult_report() {
        return result_report;
    }


}