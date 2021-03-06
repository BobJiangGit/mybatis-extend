package org.mybatis.extend.demo.model.role;

import org.mybatis.extend.generic.model.BasePrimaryKeyModel;

import java.io.Serializable;

/**
* Model: AdminRole
* Table: admin_role
* Alias: role
*
* This Model generated by MyBatis Generator Extend.
*/
public class AdminRole extends BasePrimaryKeyModel<Integer> implements Serializable {
    /**
     * 
     * enable
     */
    private Byte enable;

    /**
     * 
     * name
     */
    private String name;

    private static final long serialVersionUID = 1L;

    /**
     * 
     * enable
     */
    public Byte getEnable() {
        return enable;
    }

    /**
     * 
     * enable
     *
     * @param enable 
     */
    public void setEnable(Byte enable) {
        this.enable = enable;
    }

    /**
     * 
     * name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * name
     *
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", enable=").append(enable);
        sb.append(", name=").append(name);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        AdminRole other = (AdminRole) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        return result;
    }
}