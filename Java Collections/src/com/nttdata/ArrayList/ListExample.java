package com.nttdata.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;


public class ListExample {

	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(111,"vinod","bangalore"));
		list.add(new Employee(112,"shannu","yelahanka"));
		list.add(new Employee(113,"sai","hyderabad"));
		
	  /*  for(int i=0; i<=list.size()-1;i++)
	    {
			list.get(i).display();
		}
		
		System.out.println("Sort by ID");
		Collections.sort(list);
		
		ListIterator<Employee> itr = list.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
/*		System.out.println("Backward direction............");
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		} */
		
		System.out.println("Sort by ID");
		Collections.sort(list, new EmployeeSortById());
		ListIterator<Employee> itr = list.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("Sort by Name");
		Collections.sort(list, new EmployeeSortByName());
		ListIterator<Employee> itr1 = list.listIterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		} 
	}
	
	
}
