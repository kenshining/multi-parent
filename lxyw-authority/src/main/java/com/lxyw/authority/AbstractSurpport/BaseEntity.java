package com.lxyw.authority.AbstractSurpport;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

public abstract class BaseEntity implements Serializable {

    protected static final long serialVersionUID = 1L;

    @Id
    protected String id;

    @Column(name = "createDate")
    protected Date createDate;

    @Column(name = "createBy")
    protected String createBy;

    @Column(name = "updateDate")
    protected Date updateDate;

    @Column(name = "updateBy")
    protected String updateBy;

    @Column(name = "version")
    protected long version;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }
}
