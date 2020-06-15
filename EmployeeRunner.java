package EMS_Project;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.InputMismatchException;


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
//			System.out.println(e.getDepartmentString());
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
		deptList.remove(humanResources);
		System.out.println(deptList);
		
		// Update Departments
		humanResources.setDepartmentName("Analytics");
		System.out.println(humanResources.getDepartmentName());
		

		// error handling - creating an employee			

		Scanner sc = new Scanner(System.in);
	
		boolean charString = false;
		
		System.out.println("Enter new Employee's name: ");

		while(!charString) {
				
			try {
				String newName = sc.nextLine();		
				if (isStringOnlyAlphabet(newName)) {	
					Employee newEmp = new Employee(newName);
					empList.add(newEmp);
					System.out.println("Employee " + newName + " has been created.");
					charString = true;
					
				} else {
					throw new BadNameException();
				}
			} catch(BadNameException e) {
			}
		}
	}

			
		public static boolean isStringOnlyAlphabet(String str) {
			return ((!str.equals("")) && (str != null) && (str.matches("^[a-zA-Z]*$")));
		}
					

}
				
		
