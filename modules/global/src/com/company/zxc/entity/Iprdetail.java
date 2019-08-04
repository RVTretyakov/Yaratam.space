package com.company.zxc.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import javax.validation.constraints.NotNull;
import javax.persistence.Lob;

@NamePattern("%s %s|competency,evaluation_criterion")
@Table(name = "ZXC_IPRDETAIL")
@Entity(name = "zxc$Iprdetail")
public class Iprdetail extends StandardEntity {
    private static final long serialVersionUID = -7846319289656647084L;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "COMPETENCY_ID")
    protected Competency competency;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "GRADE_ID")
    protected Grade grade;

    @Lob
    @Column(name = "GOAL")
    protected String goal;

    @Lob
    @Column(name = "ACTIVITY")
    protected String activity;

    @Lob
    @Column(name = "EVALUATION_CRITERION")
    protected String evaluation_criterion;


    @Lob
    @Column(name = "RESULT_EMPL")
    protected String result_empl;

    @Lob
    @Column(name = "RESULT_MENTOR")
    protected String result_mentor;

    @Lob
    @Column(name = "GOAL_COMMENT_MENTOR")
    protected String goal_comment_mentor;

    @Lookup(type = LookupType.SCREEN, actions = {"lookup", "open", "clear"})
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "INDIVIDUAL_CAREER_PLAN_ID")
    protected IndividualCareerPlan individualCareerPlan;

    public void setGoal_comment_mentor(String goal_comment_mentor) {
        this.goal_comment_mentor = goal_comment_mentor;
    }

    public String getGoal_comment_mentor() {
        return goal_comment_mentor;
    }


    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public Grade getGrade() {
        return grade;
    }


    public void setResult_empl(String result_empl) {
        this.result_empl = result_empl;
    }

    public String getResult_empl() {
        return result_empl;
    }

    public void setResult_mentor(String result_mentor) {
        this.result_mentor = result_mentor;
    }

    public String getResult_mentor() {
        return result_mentor;
    }


    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getActivity() {
        return activity;
    }


    public void setGoal(String goal) {
        this.goal = goal;
    }

    public String getGoal() {
        return goal;
    }


    public void setIndividualCareerPlan(IndividualCareerPlan individualCareerPlan) {
        this.individualCareerPlan = individualCareerPlan;
    }

    public IndividualCareerPlan getIndividualCareerPlan() {
        return individualCareerPlan;
    }


    public void setCompetency(Competency competency) {
        this.competency = competency;
    }

    public Competency getCompetency() {
        return competency;
    }

    public void setEvaluation_criterion(String evaluation_criterion) {
        this.evaluation_criterion = evaluation_criterion;
    }

    public String getEvaluation_criterion() {
        return evaluation_criterion;
    }



}