package com.company.zxc.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.entity.StandardEntity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import javax.persistence.Lob;

@Table(name = "ZXC_WORK_PLAN_DETAIL")
@Entity(name = "zxc$WorkPlanDetail")
public class WorkPlanDetail extends StandardEntity {
    private static final long serialVersionUID = 1388739738772424798L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "WORK_PLAN_ID")
    protected WorkPlan workPlan;


    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PROJECT_ID")
    protected Project project;

    @Lob
    @Column(name = "PLANNED_WORKS")
    protected String plannedWorks;

    @Lob
    @Column(name = "PROJECTS_TASKS")
    protected String projectsTasks;

    @Lob
    @Column(name = "EVALUATION_CRITERION")
    protected String evaluation_criterion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "GRADE_ID")
    protected Grade grade;

    @Lob
    @Column(name = "RESULT_EMPL")
    protected String resultEmpl;

    @Lob
    @Column(name = "RESULT_CHIEF")
    protected String resultChief;

    public void setResultChief(String resultChief) {
        this.resultChief = resultChief;
    }

    public String getResultChief() {
        return resultChief;
    }


    public void setResultEmpl(String resultEmpl) {
        this.resultEmpl = resultEmpl;
    }

    public String getResultEmpl() {
        return resultEmpl;
    }


    public void setEvaluation_criterion(String evaluation_criterion) {
        this.evaluation_criterion = evaluation_criterion;
    }

    public String getEvaluation_criterion() {
        return evaluation_criterion;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public Grade getGrade() {
        return grade;
    }


    public void setPlannedWorks(String plannedWorks) {
        this.plannedWorks = plannedWorks;
    }

    public String getPlannedWorks() {
        return plannedWorks;
    }

    public void setProjectsTasks(String projectsTasks) {
        this.projectsTasks = projectsTasks;
    }

    public String getProjectsTasks() {
        return projectsTasks;
    }


    public void setProject(Project project) {
        this.project = project;
    }

    public Project getProject() {
        return project;
    }


    public void setWorkPlan(WorkPlan workPlan) {
        this.workPlan = workPlan;
    }

    public WorkPlan getWorkPlan() {
        return workPlan;
    }


}