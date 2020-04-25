package com.easylearn.collections.example;

public class EmployeeBean implements Comparable     // implements Comparator 
{

	private Integer empId;
	private String empName;
	private Long ssnId;
	private Double salary;
	
	public EmployeeBean() {
	}

	public EmployeeBean(Integer empId, String empName, Long ssnId, Double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.ssnId = ssnId;
		this.salary = salary;
	}

	public Integer getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setSsnId(Long ssnId) {
		this.ssnId = ssnId;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Long getSsnId() {
		return ssnId;
	}

	public Double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "EmployeeBean [empId=" + empId + ", empName=" + empName + ", ssnId=" + ssnId + ", salary=" + salary
				+ "]";
	}

	@Override
	public int compareTo(Object o) {
		EmployeeBean e1 = (EmployeeBean) o;
		
		if (e1.getEmpId() > this.getEmpId()) {
			return 1;
		} else if (e1.getEmpId() < this.getEmpId()) {
			return -1;
		} else {
			return 0;
		}
	}

	/*@Override
	public int compare(Object o1, Object o2) {
		EmployeeBean e1 = (EmployeeBean) o1;
		EmployeeBean e2 = (EmployeeBean) o2;

		if (e1.getEmpId() > e2.getEmpId()) {
			return -1;
		} else if (e1.getEmpId() < e2.getEmpId()) {
			return 1;
		} else {
			return 0;
		}
		
		return e2.getEmpName().compareTo(e1.getEmpName());
	}*/

}
