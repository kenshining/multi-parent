package com.lxyw.authority.entity;

import com.lxyw.authority.AbstractSurpport.BaseEntity;

import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author Mht
 * @since 2019-01-23
 */
public class GroupPrivilegeRole extends BaseEntity{

    private static final long serialVersionUID = 1L;

    private String privilege_role_name;

    private String privilege_id;

    private String role_id;

    private String remark;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getPrivilege_role_name() {
        return privilege_role_name;
    }

    public void setPrivilege_role_name(String privilege_role_name) {
        this.privilege_role_name = privilege_role_name;
    }

    public String getPrivilege_id() {
        return privilege_id;
    }

    public void setPrivilege_id(String privilege_id) {
        this.privilege_id = privilege_id;
    }

    public String getRole_id() {
        return role_id;
    }

    public void setRole_id(String role_id) {
        this.role_id = role_id;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
