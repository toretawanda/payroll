package zw.co.hitrac.payroll.business.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import zw.co.hitrac.payroll.business.api.domain.Qualification;

/**
 *
 * @author tore
 */
public interface QualificationRepository extends JpaRepository<Qualification, Long>{
    
}