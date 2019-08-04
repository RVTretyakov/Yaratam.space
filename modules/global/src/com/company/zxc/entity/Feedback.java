package com.company.zxc.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Lob;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Table(name = "ZXC_FEEDBACK")
@Entity(name = "zxc$Feedback")
public class Feedback extends StandardEntity {
    private static final long serialVersionUID = 2922872398105330200L;

    @NotNull
    @Lob
    @Column(name = "MESSAGE", nullable = false)
    protected String message;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "EMPLOYEE_ID")
    protected Employee employee;

    @Column(name = "SIGNATURE")
    protected String signature;

    @Lob
    @Column(name = "CHIEF_COMMENT")
    protected String chief_comment;

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }


    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getSignature() {
        return signature;
    }


    public void setChief_comment(String chief_comment) {
        this.chief_comment = chief_comment;
    }

    public String getChief_comment() {
        return chief_comment;
    }


    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }


}