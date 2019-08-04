package com.company.zxc.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.InheritanceType;
import javax.persistence.DiscriminatorType;
import javax.persistence.Inheritance;
import javax.persistence.DiscriminatorColumn;
import com.haulmont.cuba.core.entity.StandardEntity;
import javax.persistence.Column;
import com.haulmont.chile.core.annotations.NamePattern;
import javax.persistence.Index;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.List;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import com.haulmont.cuba.security.entity.User;
import com.haulmont.cuba.core.*;

@NamePattern("%s|fio")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "DTYPE", discriminatorType = DiscriminatorType.STRING)
@Table(name = "ZXC_EMPLOYEE", indexes = {
    @Index(name = "IDX_ZXC_EMPLOYEE", columnList = "FIO")
})
@Entity(name = "zxc$Employee")
public class Employee extends StandardEntity {
    private static final long serialVersionUID = -4941682002890323292L;

//    @Inject
//    private DataManager dataManager;


    @NotNull
    @Column(name = "FIO")
    protected String fio;




    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CUBA_USER_ID_ID")
    protected User cubaUserId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CHIEF_ID")
    protected Employee chief;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ROLE_ID")
    protected UserRole userRole;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DEPARTMENT_ID")
    protected Department department;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TEAM_LEAD_ID")
    protected Employee teamLead;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "POSITION_ID")
    protected Position position;

    public void setCubaUserId(User cubaUserId) {
        this.cubaUserId = cubaUserId;
    }

    public User getCubaUserId() {
        return cubaUserId;
    }


    public void setChief(Employee chief) {
        this.chief = chief;
    }

    public Employee getChief() {
        return chief;
    }


    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }

    public UserRole getUserRole() {
        return userRole;
    }


    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }


    public void setPosition(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }


    public void setTeamLead(Employee teamLead) {
        this.teamLead = teamLead;
    }

    public Employee getTeamLead() {
        return teamLead;
    }



    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getFio() {
        return fio;
    }

//    @PostConstruct
//    protected void init() {
//
//    }

//    @Nullable
//    public Employee getByUserId(UUID id) {
//        LoadContext<Employee> loadContext = LoadContext.create(Employee.class)
//                .setQuery(LoadContext.createQuery("select e from zxc$employee e where e.CUBA_USER_ID_ID = :id"))
//                    .setParameter("id", id);
//                    .setView(view);
//        List<Employee> data = dataManager.loadList(loadContext);
//        if (data.size > 0) {
//            return (Employee) emp = data.get(0);
//        } else {
//            return null;
//        }
//        dataManager.load(LoadContext.create(Employee.class)
//                .setId(id));
//    }


}