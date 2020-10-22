package com.nttadata.Set;

import java.util.LinkedHashSet;

public class LinkHashSetExam {

	public static void main(String[] args) {
		
		LinkedHashSet<Employee> set = new LinkedHashSet<>();
		
		set.add(new Employee(123,"vinod","Bangalore"));
		set.add(new Employee(121,"sahnnu","Mysore"));
		set.add(new Employee(131,"sai","Bangalore"));
		set.add(new Employee(123,"vinod","bangalore"));
		
		for (Employee employee : set) {
			System.out.println(employee);
		}
		
		//lambda
		
		long c = set.stream().map(s->s.getEmpId()).count();
		System.out.println("total no of employeess....  :"+c);
	}
}
