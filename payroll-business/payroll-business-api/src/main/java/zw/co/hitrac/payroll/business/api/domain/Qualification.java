package zw.co.hitrac.payroll.business.api.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author tore tawanda
 */
@Entity
@Table(name = "qualification")
public class Qualification extends BaseEntity {
 private static final long serialVersionUID = 1L;
    
      
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        
        if (!(object instanceof Qualification)) {
            return false;
        }
        Qualification other = (Qualification) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "zw.co.hitrac.payroll.business.api.domain.Qualification[ id=" + id + " ]";
    }
    
    
}

