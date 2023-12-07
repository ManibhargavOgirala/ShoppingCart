package com.ayasyashoppingcart.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
/*
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
*/

import java.util.Date;
@MappedSuperclass
public class BaseClass {

    private static final long serialVersionUID = 3868046798135942430L;

    @JsonIgnore
    @Column(name = "created_by")
    private String createdBy;
    @CreationTimestamp
    @JsonIgnore
    @Column(name = "created_dt")
    private Date createdDate;

    @JsonIgnore
    @Column(name = "updated_by")
    private String updatedBy;
    @UpdateTimestamp
    @JsonIgnore
    @Column(name = "updated_dt")
    private Date updatedDate;

    @Column(name = "is_active")
    private String isActive;

    public BaseClass() {
        super();
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "EntityAudit [createdBy=" + createdBy + ", createdDate=" + createdDate + ", updatedBy=" + updatedBy
                + ", updatedDate=" + updatedDate + ", isActive=" + isActive + "]";
    }
}
