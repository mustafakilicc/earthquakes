package com.info.earthquakes.core.dto;

import java.io.Serializable;


public class BaseDTO implements Serializable {
    protected Long id;
    protected Boolean deleted;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}