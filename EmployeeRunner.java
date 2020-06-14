package ems_project;

import java.util.ArrayList;
import java.util.List;


// TO-DO: 
// Fix 'list all employee information'
// Remove and Update department and employee information
// Know which employees are in which departments (departments.getEmpList - which we might already have)
// Create JUnit Testing
// Create one custom exception


public class EmployeeRunner {

	public static void main(String[] args) {
		
		Departments humanResources = new Departments("Human Resources");
		Manager manager = new Manager("Monica");
		
		// !!!!! FIX THROUGH EMPLOYEE !!! //
		Employee Tom = new Employee(123456, "Tom", "New York", humanResources); 
		
		humanResources.setDeptManager(manager);
//		System.out.println(humanResources.getDeptManager());
		
		
		//// List, Add, Update and Remove Employee Information ////

		// Create Employee List
		List<Employee> empList = new ArrayList<Employee>();
		
		// Add Employees
		empList.add(manager);
		empList.add(Tom);
		
		// Remove Employee Information
		
		// Update Employee Information
		
		
		// List Employee List
		System.out.println(empList);
		
		// List Employee Names
		for (Employee e : empList) {
			System.out.println(e.getName());
		}

		
		//// Know all Departments in the Company and which employees are in them
		// Add, Remove, Update, and List Departments ////
		
		// Create Department List
		List<Departments> deptList = new ArrayList<Departments>();
		
		// Add Departments
		deptList.add(humanResources);
		
		// List Departments
		System.out.println(deptList);
		
		// Remove Departments
//		empList.remove(index)
		// Update Departments
		
		
		
		
		

	}

}
