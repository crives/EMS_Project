package EMS_Project;

import java.util.ArrayList;
import java.util.List;
import java.util.InputMismatchException;
import java.util.Scanner;

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

		Employee Tom = new Employee(123456, "Tom", "New York", humanResources);

		humanResources.setDepartmentManager(manager);
//		System.out.println(humanResources.getDeptManager());

		//// List, Add, Update and Remove Employee Information ////

		// Create Employee List
		List<Employee> empList = new ArrayList<Employee>();

		// Add Employees
		empList.add(manager); // Monica - Manager
		empList.add(Tom); // Tom - Regular Employee

		// List Employee List
		System.out.println(empList);

		// List Employee Names
		for (Employee e : empList) {
			System.out.println(e.getName());
		}

		// Remove Employee Information
		empList.remove(Tom);

		// List Employee Names - No more Tom
		for (Employee e : empList) {
			System.out.println(e.getName());
		}

		// Update Employee Information
		manager.setName("MoniMoniMoni");
		// Show change
		System.out.println(manager.getName());

		//// Know all Departments in the Company and which employees are in them
		// Add, Remove, Update, and List Departments ////

		// Create Department List
		List<Departments> deptList = new ArrayList<Departments>();

		// Add Departments
		deptList.add(humanResources);

		// List Departments
		// System.out.println(deptList);
		for (Departments d : deptList) {
			System.out.println(d.getDepartmentName());
		}

		// Remove Departments
//		empList.remove(index)
		// Update Departments

		// error handling - creating an employee
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Enter new Employee's name: ");
			try {
				String newName = sc.nextLine();
				Employee newEmp = new Employee(newName);
				System.out.println("Employee " + newName + " has been created.");
				empList.add(newEmp);
				break;
			} catch (InputMismatchException e) {
				sc.hasNextLine();
				System.out.println("Please enter a valid name.");
			}
		}
		sc.close();
	}

}
