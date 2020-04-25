package com.easylearn.collections.example;

import java.util.Comparator;

@SuppressWarnings("rawtypes")
public class EmployeeComparator implements Comparator {

	@Override
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
		
		//return e2.getEmpName().compareTo(e1.getEmpName());
	}

}
