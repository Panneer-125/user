package security.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import security.user.entity.DeliveriesEntity;

@Repository
public interface DeliveriesRepository extends JpaRepository <DeliveriesEntity,Integer> {

}
