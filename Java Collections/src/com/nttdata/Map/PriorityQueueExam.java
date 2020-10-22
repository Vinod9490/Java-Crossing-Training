package com.nttdata.Map;

import java.util.PriorityQueue;

public class PriorityQueueExam {

	public static void main(String[] args) {
		
		
		PriorityQueue<Book> queue = new PriorityQueue<>();
		
		queue.add(new Book(1,"java","james",870));
		queue.add(new Book(2,"AngularJs","cliffton",550));
		queue.add(new Book(3,"SQL","cooper",230));
		queue.add(new Book(4,"VM ware","andrew",780));
		
		for (Book book : queue) {
			System.out.println(book);
			
			System.out.println(queue.containsAll(queue));
			System.out.println(queue.isEmpty());
		
		}
		System.out.println("After Removing....");
		
			queue.remove();
		
		for (Book book : queue) {
			System.out.println(book);
			
		}
		
		System.out.println(queue.remove());
		
		
		///
		double d = queue.stream().map(s->s.getBookPrice()).reduce(0.0, (sum,price)->(sum+price));
		System.out.println("Total bill...:"+d);
		
	}
}
