package com.nttdata.LinkedListExample;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkListExam {

	public static void main(String[] args) {
		List<Employee> list = new LinkedList();
		
		list.add(new Employee(121,"vinod","Bangalore"));
		list.add(new Employee(435,"shannu","nysore"));
		list.add(new Employee(111,"sai","bangalore"));
		
		System.out.println("Sort by Id");
		Collections.sort(list, new EmployeeById());
		ListIterator<Employee> itr = list.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("Sort by Name");
		Collections.sort(list, new EmployeeByName());
		ListIterator<Employee> itr1 = list.listIterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
	}
}
