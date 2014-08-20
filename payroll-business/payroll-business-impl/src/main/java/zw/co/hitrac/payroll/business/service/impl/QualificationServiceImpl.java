package zw.co.hitrac.payroll.business.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import zw.co.hitrac.payroll.business.api.dao.QualificationDao;
import zw.co.hitrac.payroll.business.api.domain.Qualification;
import zw.co.hitrac.payroll.business.api.service.QualificationService;

/**
 *
 * @author tore
 */
@Service
@Transactional(readOnly=true)
public class QualificationServiceImpl implements QualificationService {

    @Autowired
    private QualificationDao qualificationDao;

   @Transactional
    public Qualification save(Qualification qualification) {
        return qualificationDao.save(qualification);
    }

    public Qualification find(Long id) {
        return qualificationDao.find(id);
    }

    public List<Qualification> findAll() {
        return qualificationDao.findAll();
    }
}
