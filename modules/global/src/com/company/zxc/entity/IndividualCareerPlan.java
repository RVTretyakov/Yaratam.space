package com.company.zxc.entity;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.haulmont.cuba.core.entity.StandardEntity;
import javax.validation.constraints.NotNull;
import javax.persistence.ManyToOne;
import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.AppBeans;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.core.global.DeletePolicy;
import com.haulmont.cuba.core.global.UserSessionSource;
import com.haulmont.cuba.security.entity.User;

import java.util.List;
import javax.persistence.OneToMany;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.util.Set;
import javax.persistence.Lob;

@Table(name = "ZXC_INDIVIDUAL_CAREER_PLAN")
@Entity(name = "zxc$IndividualCareerPlan")
public class IndividualCareerPlan extends StandardEntity {
    private static final long serialVersionUID = 7133243860917840313L;

//    @Inject
//    private DataManager dataManager;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "EMPLOYEE_ID")
    protected Employee employee;

    @NotNull
    @Temporal(TemporalType.DATE)
    @Column(name = "DATE_TO", nullable = false)
    protected Date dateTo;

    @Lob
    @Column(name = "GOAL")
    protected String goal;

    @OneToMany(mappedBy = "individualCareerPlan")
    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @NotNull
    protected Set<Iprdetail> iprdetail;


    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "GRADE_ID")
    protected Grade grade;

    @Lob
    @Column(name = "RESULT_EMPLOYEE")
    protected String result_employee;

    @Lob
    @Column(name = "RESULT_MENTOR")
    protected String result_mentor;


    public void setGoal(String goal) {
        this.goal = goal;
    }

    public String getGoal() {
        return goal;
    }


    public Set<Iprdetail> getIprdetail() {
        return iprdetail;
    }

    public void setIprdetail(Set<Iprdetail> iprdetail) {
        this.iprdetail = iprdetail;
    }















    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public Grade getGrade() {
        return grade;
    }


    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }





    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public void setResult_employee(String result_employee) {
        this.result_employee = result_employee;
    }

    public String getResult_employee() {
        return result_employee;
    }

    public void setResult_mentor(String result_mentor) {
        this.result_mentor = result_mentor;
    }

    public String getResult_mentor() {
        return result_mentor;
    }


    /*@PostConstruct
    protected void init() {
        Employee employee = new Employee();

        //
        User user = AppBeans.get(UserSessionSource.class).getUserSession().getUser();
        System.out.println(user.getId());
        List<Employee> list;
        list = dataManager
                .load(Employee.class)
                .query("SELECT e FROM zxc_employee e \n" +
                        "WHERE e.CUBA_USER_ID_ID = :user_id")
                .parameter("user_id", user.getId())
//                .view()
                .list();
        if (!list.isEmpty()) {
            setEmployee(list.get(0));
        }
    }*/

}