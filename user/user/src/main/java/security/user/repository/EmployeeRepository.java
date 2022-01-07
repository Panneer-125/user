package security.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import security.user.entity.EmployeeEntity;
import security.user.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Integer> {



}
