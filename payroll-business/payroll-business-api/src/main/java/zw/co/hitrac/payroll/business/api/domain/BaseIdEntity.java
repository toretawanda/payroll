package zw.co.hitrac.payroll.business.api.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author tore tawanda
 */
@MappedSuperclass
public abstract class BaseIdEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    private Date dateCreated = new Date();
    private Date dateModified;
    private String uid = UUID.randomUUID().toString();
    private Boolean retired = Boolean.FALSE;
    private String code;

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateModified() {
        return dateModified;
    }

    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Boolean getRetired() {
        return retired;
    }

    public void setRetired(Boolean retired) {
        this.retired = retired;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BaseIdEntity)) {
            return false;
        }
        BaseIdEntity other = (BaseIdEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "zw.co.hitrac.payroll.business.api.domain.BaseIdEntity[ id=" + id + " ]";
    }
}
