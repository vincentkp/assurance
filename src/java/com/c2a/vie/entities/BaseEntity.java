package com.c2a.vie.entities;

import java.io.Serializable;
import javax.persistence.Version;

/**
 *
 * @author K.M.A.
 */

public abstract class BaseEntity implements Serializable {

    @Version
    protected Integer version;

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}