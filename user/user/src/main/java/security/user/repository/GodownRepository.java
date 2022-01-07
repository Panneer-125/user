package security.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import security.user.entity.GodownEntity;

@Repository
public interface GodownRepository extends JpaRepository<GodownEntity,Integer> {

}
