package zw.co.hitrac.payroll.business.api.dao;

import java.io.Serializable;
import java.util.List;
import zw.co.hitrac.payroll.business.api.domain.Qualification;

/**
 *
 * @author tore tawanda
 */

public interface QualificationDao extends Serializable{
     
    public Qualification save(Qualification qualification);
    
    public Qualification find(Long id);
    
    public List<Qualification> findAll();
    
}
