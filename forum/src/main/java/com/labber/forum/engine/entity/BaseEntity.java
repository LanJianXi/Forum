package com.labber.forum.engine.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Tony
 * @create 2017 - 10 -23 -22:51
 */
public abstract class BaseEntity implements Serializable{

    private Integer id;
    private Date createTime;
    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
