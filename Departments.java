package EMS_Project;

import java.util.ArrayList;
import java.util.List;

public class Departments {

	private String departmentName;
	// Department 'HAS-A' Manager
	private Manager deptManager;

	private List<Employee> employeeList = new ArrayList<Employee>();

	public Departments(String departmentName) {
		this.departmentName = departmentName;
	}

	public Departments(String departmentName, Manager deptManager) {
		this.departmentName = departmentName;
		this.deptManager = deptManager;
	}

	public Departments(String departmentName, Manager deptManager, List<Employee> employeeList) {
		this.departmentName = departmentName;
		this.deptManager = deptManager;
		this.employeeList = employeeList;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Manager getDepartmenttManager() {
		return deptManager;
	}

	public void setDepartmentManager(Manager deptManager) {
		this.deptManager = deptManager;
	}

	// Prints out employeeList and returns the List itself
	public List<Employee> getEmployeeList() {
//		System.out.println(this.departmentName);
		for (Employee emp : employeeList) {
			System.out.println(emp.getName());
		}
		return employeeList;
	}

	public void setEmployeeList(Employee emp) {
		employeeList.add(emp);
	}

}
