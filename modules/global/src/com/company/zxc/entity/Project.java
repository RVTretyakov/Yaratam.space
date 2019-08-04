package com.company.zxc.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@NamePattern("%s|name")
@Table(name = "ZXC_PROJECT")
@Entity(name = "zxc$Project")
public class Project extends StandardEntity {
    private static final long serialVersionUID = 6833603864745148198L;

    @Column(name = "NAME")
    protected String name;



    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}