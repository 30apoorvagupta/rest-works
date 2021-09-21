package com.barclays.rest.works.contract;

import java.util.List;
import com.barclays.rest.works.entity.Employee;


public interface IEmployeeService {
	public Employee insertEmployee(Employee employee);
	public List<Employee> getAllEmployees();
	public Employee getEmployeeById(int empId);
	
	public String delete(int empId);
	public Employee update(Employee employee);
	
	public List<Employee>  getEmployeesByName(String empName);
	public List<Employee>  getEmployeesBetweenSalaries(double MinSal,double MaxSal);
	

}
