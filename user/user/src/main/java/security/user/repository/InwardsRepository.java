package security.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import security.user.entity.InwardsEntity;

@Repository
public interface InwardsRepository extends JpaRepository<InwardsEntity,Integer> {

}
