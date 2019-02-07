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
@Table(name = "group_privilege_role")
public class GroupPrivilegeRole extends BaseEntity{

    private static final long serialVersionUID = 1L;

    @Column(name = "privilege_role_name")
    private String privilegeRoleName;

    @Column(name = "privilege_id")
    private String privilegeId;

    @Column(name = "role_id")
    private String roleId;

    @Column(name = "remark")
    private String remark;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getPrivilegeRoleName() {
        return privilegeRoleName;
    }

    public void setPrivilegeRoleName(String privilegeRoleName) {
        this.privilegeRoleName = privilegeRoleName;
    }

    public String getPrivilegeId() {
        return privilegeId;
    }

    public void setPrivilegeId(String privilegeId) {
        this.privilegeId = privilegeId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
