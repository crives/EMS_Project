package ems_project;


public class EmployeeRunner {

	public static void main(String[] args) {
		
		Departments humanResources = new Departments("Human Resources");
		Manager manager = new Manager("Monica");
		
		humanResources.setDeptManager(manager);
//		System.out.println(humanResources.getDeptManager());
		
		

	}

}
