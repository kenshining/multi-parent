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
public class Privilege extends BaseEntity{

    private static final long serialVersionUID = 1L;

    private String privilege_name;

    private String privilege_code;

    private String privilege_url;

    private String privilege_type;

    private String remarks;

    private Integer status;

}
