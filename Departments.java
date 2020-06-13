package ems_project;
import java.util.ArrayList;
import java.util.List;

public class Departments {
	
	private String departmentName;
	private Manager deptManager;
	
	private List<Employee> employeeList = new ArrayList<Employee>();
	
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
		return employeeList;
	}
	
	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}
	
	
	

	
}
