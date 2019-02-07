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
@Table(name = "group_user_role")
public class GroupUserRole extends BaseEntity{

    private static final long serialVersionUID = 1L;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "role_id")
    private String roleId;

    @Column(name = "remarks")
    private String remarks;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
