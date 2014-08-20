package zw.co.hitrac.payroll.business.api.service;

import java.io.Serializable;
import java.util.List;
import zw.co.hitrac.payroll.business.api.domain.Qualification;

/**
 *
 * @author tore
 */
public interface QualificationService extends Serializable{
    
    public Qualification save(Qualification qualification);
    
    public Qualification find(Long id);
    
    public List<Qualification> findAll();
    
}
