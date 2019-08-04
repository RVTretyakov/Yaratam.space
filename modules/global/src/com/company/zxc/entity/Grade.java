package com.company.zxc.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.UUID;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.BaseIntegerIdEntity;
import com.haulmont.cuba.core.entity.HasUuid;
import com.haulmont.chile.core.annotations.NamePattern;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@NamePattern("%s|name")
@Table(name = "ZXC_GRADE")
@Entity(name = "zxc$Grade")
public class Grade extends BaseIntegerIdEntity implements HasUuid {
    private static final long serialVersionUID = -5828773303937548578L;

    @Column(name = "UUID")
    protected UUID uuid;

    @NotNull
    @Column(name = "NAME", nullable = false, length = 1)
    protected String name;

    @Column(name = "DESCRIPTION", length = 2000)
    protected String description;


    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }


    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}