package com.company.zxc.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.List;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Lob;

@NamePattern("%s|name")
@Table(name = "ZXC_COMPETENCY")
@Entity(name = "zxc$Competency")
public class Competency extends StandardEntity {
    private static final long serialVersionUID = 351734334418284272L;

    @NotNull
    @Column(name = "NAME", nullable = false, unique = true, length = 2000)
    protected String name;




    @Lob
    @Column(name = "DESCRIPTION")
    protected String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EMPLOYEE_MASTER_ID")
    protected Employee employee_master;

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setEmployee_master(Employee employee_master) {
        this.employee_master = employee_master;
    }

    public Employee getEmployee_master() {
        return employee_master;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}