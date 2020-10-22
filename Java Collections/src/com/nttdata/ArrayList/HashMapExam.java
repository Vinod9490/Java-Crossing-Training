package com.nttdata.ArrayList;

import java.util.HashMap;
import java.util.Map;

import com.nttdata.Map.Book;

;

public class HashMapExam {

	
	public static void main(String[] args) {
		
		HashMap<Integer, Book> hm = new HashMap<>();
		
		hm.put(1, new Book(1,"java","james",870));
		hm.put(5, new Book(2,"AngularJs","cliffton",550));
		hm.put(3, new Book(3,"SQL","cooper",230));
		hm.put(8, new Book(4,"VM ware","andrew",780));
		hm.put(8, new Book(4,"VM ware","andrew",780));
		hm.put(null, new Book(4,"VM ware","andrew",780));
		hm.put(null,null);
		hm.put(null,null);
		hm.put(8,null);
		
		
		for (Map.Entry<Integer, Book> m : hm.entrySet()) {
			
			System.out.println("key is :"+m.getKey()+"\t"+"Value is :"+m.getValue());
			
		}
	}
}
