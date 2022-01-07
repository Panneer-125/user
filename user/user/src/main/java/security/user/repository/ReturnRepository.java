package security.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import security.user.entity.ReturnEntity;

@Repository
public interface ReturnRepository extends JpaRepository<ReturnEntity,Integer> {

}
