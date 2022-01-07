package security.user.service;

import security.user.model.Employee;

public interface EmployeeService {
	Employee saveEmployee(Employee employee);
	void updateEmployee(Employee employee,int id);
	void deleteEmployee(int employeeId);

}
