package com.lxyw.authority.entity;

import com.lxyw.authority.AbstractSurpport.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author Mht
 * @since 2019-01-23
 */
@Table(name = "privilege")
public class Privilege extends BaseEntity{

    private static final long serialVersionUID = 1L;

    @Column(name = "privilege_name")
    private String privilegeName;

    @Column(name = "privilege_code")
    private String privilegeCode;

    @Column(name = "privilege_url")
    private String privilegeUrl;

    @Column(name = "privilege_type")
    private String privilegeType;

    @Column(name = "remarks")
    private String remarks;

    @Column(name = "status")
    private Integer status;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getPrivilegeName() {
        return privilegeName;
    }

    public void setPrivilegeName(String privilegeName) {
        this.privilegeName = privilegeName;
    }

    public String getPrivilegeCode() {
        return privilegeCode;
    }

    public void setPrivilegeCode(String privilegeCode) {
        this.privilegeCode = privilegeCode;
    }

    public String getPrivilegeUrl() {
        return privilegeUrl;
    }

    public void setPrivilegeUrl(String privilegeUrl) {
        this.privilegeUrl = privilegeUrl;
    }

    public String getPrivilegeType() {
        return privilegeType;
    }

    public void setPrivilegeType(String privilegeType) {
        this.privilegeType = privilegeType;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
