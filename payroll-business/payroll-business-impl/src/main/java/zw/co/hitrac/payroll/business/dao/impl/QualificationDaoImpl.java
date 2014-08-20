package zw.co.hitrac.payroll.business.dao.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import zw.co.hitrac.payroll.business.api.dao.QualificationDao;
import zw.co.hitrac.payroll.business.api.domain.Qualification;
import zw.co.hitrac.payroll.business.repository.QualificationRepository;

/**
 *
 * @author tore
 */

@Repository
public class QualificationDaoImpl implements QualificationDao{
        
    @Autowired
    private QualificationRepository  qualificationRepository;
    
    public Qualification save(Qualification qualification) {
       return qualificationRepository.save(qualification);
    }

    public Qualification find(Long id) {
     return qualificationRepository.findOne(id);
    }

    public List<Qualification> findAll() {
        return qualificationRepository.findAll();
    }
    
}