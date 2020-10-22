package com.nttdata.ArrayList;

import java.util.Map;
import java.util.TreeMap;

import com.nttdata.Map.Book;

public class TreeMapExam {

	
	public static void main(String[] args) {
		
		TreeMap<Integer, Book>  tm = new TreeMap<>();
		

		tm.put(1, new Book(1,"java","james",870));
		tm.put(5, new Book(2,"AngularJs","cliffton",550));
		tm.put(3, new Book(3,"SQL","cooper",230));
		tm.put(8, new Book(4,"VM ware","andrew",780));
		tm.put(11, new Book(4,"VM ware","andrew",780));
		tm.put(8, new Book(4,"VM ware","andrew",780));
		tm.put(12, new Book(4,"VM ware","andrew",780));
		tm.put(15, null);
		//tm.put(null, null);
		tm.put(18,null);
		
		
        for (Map.Entry<Integer, Book> m : tm.entrySet()) {
			
			System.out.println("key is :"+m.getKey()+"\t"+"Value is :"+m.getValue());
			
		}
	
	}
}
