package com.nttdata.LinkedListExample;

import java.util.Comparator;

public class EmployeeById implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1.getEmpId()<o2.getEmpId())
		{
			return -1;
		}
		else if(o1.getEmpId()>o2.getEmpId())
		{
			return 1;
		}
		return 0;
	}

}
