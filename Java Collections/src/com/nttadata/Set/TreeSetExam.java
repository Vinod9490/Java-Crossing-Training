package com.nttadata.Set;

import java.util.TreeSet;
import java.util.*;
import java.util.Collections;

public class TreeSetExam {

	public static void main(String[] args) {
		TreeSet<Employee> set = new TreeSet<>(new EmployeeById());
		
		set.add(new Employee(1,"vinod","bangalore"));
		set.add(new Employee(5,"shannu","mysore"));
		set.add(new Employee(3,"sai","bangalore"));
		set.add(new Employee(8,"vinod","bangalore"));
		set.add(new Employee(1,"vinod","bangalore"));
		
		for (Employee employee : set) {
			System.out.println(employee);
			
		}
	}
}
