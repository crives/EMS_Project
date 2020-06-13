package ems_project;
import java.util.ArrayList;
import java.util.List;

public class Departments {
	
	private String departmentName;
	private Manager deptManager;
	
	private List<Employee> employeeList = new ArrayList<Employee>();
	
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
	
	public Manager getDeptManager() {
		return deptManager;
	}
	
	public void setDeptManager(Manager deptManager) {
		this.deptManager = deptManager;
	}
	
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
