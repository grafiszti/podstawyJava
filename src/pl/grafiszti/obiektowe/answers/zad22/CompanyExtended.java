package pl.grafiszti.obiektowe.answers.zad22;

import java.util.ArrayList;

import pl.grafiszti.obiektowe.answers.zad21.Employee;

public class CompanyExtended {
	ArrayList<Employee> employees;
	
	public CompanyExtended(){
		employees = new ArrayList<Employee>();
	}
	
	public void addEmployee(Employee employee){
		employees.add(employee);
	}
	
	public Employee getEmployee(int employeeIndex){
		return employees.get(employeeIndex);
	}
	
	public ArrayList<Employee> getAllEmployees(){
		return employees;
	}
}
