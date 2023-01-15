package greatlearning.backend.service;

import java.util.List;

import greatlearning.backend.model.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployees();
void saveEmployee(Employee employee);
Employee getEmployeeById(long id);
void deleteEmployeeById(long id);

}