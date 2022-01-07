package security.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import security.user.model.Employee;
import security.user.service.EmployeeService;

@RestController
@RequestMapping("/employeedetails")
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	@PostMapping("/employee")
	public Employee saveEmployee(@RequestBody Employee employee) {
		employee=employeeService.saveEmployee(employee);
		return employee;
	}
	@PutMapping(value="/employee/{id}")
    public Employee updateEmployee( @PathVariable("id")int id,@RequestBody Employee employee) {
		
		employeeService.updateEmployee(employee,id);
		return employee;	
		
}
	@DeleteMapping(value="/delete/{employeeId}")
	public void deleteEmployee(@PathVariable("employeeId") int employeeId) {
		employeeService.deleteEmployee(employeeId);
}
}