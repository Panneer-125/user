package security.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import security.user.entity.EmployeeEntity;
import security.user.model.Employee;
import security.user.repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public Employee saveEmployee(Employee employee) {
		EmployeeEntity e=new EmployeeEntity();
		e.setAddress(employee.getAddress());
		e.setEmail(employee.getEmail());
		e.setName(employee.getName());
		employeeRepository.save(e);
		return employee;
	}

	@Override
	public void deleteEmployee(int employeeId) {
		employeeRepository.deleteById(employeeId);
		
	}

	@Override
	public void updateEmployee(Employee employee, int id) {
		EmployeeEntity  e=employeeRepository.findById(id).get();
		employee.setAddress(e.getAddress());
		employee.setEmail(e.getEmail());
		employee.setName(e.getName());
		employeeRepository.save(e);
		
	}

	


	}

	
    

