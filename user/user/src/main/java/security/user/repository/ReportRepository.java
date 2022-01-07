package security.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import security.user.entity.ReportEntity;

@Repository
public interface ReportRepository extends JpaRepository<ReportEntity,Integer> {

}
