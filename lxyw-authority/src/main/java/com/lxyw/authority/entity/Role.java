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
@Table(name = "role")
public class Role extends BaseEntity{

    private static final long serialVersionUID = 1L;

    @Column(name = "role_name")
    private String roleName;
    @Column(name = "role_code")
    private String roleCode;
    @Column(name = "remarks")
    private String remarks;
    @Column(name = "status")
    private Integer status;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
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
