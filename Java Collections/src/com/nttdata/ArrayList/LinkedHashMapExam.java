package com.nttdata.ArrayList;

import java.util.LinkedHashMap;
import java.util.Map;

import com.nttdata.Map.Book;


public class LinkedHashMapExam {
	
	
	public static void main(String[] args) {
		
		
		LinkedHashMap<Integer, Book> lhm = new LinkedHashMap<>();
	
		lhm.put(1, new Book(1,"java","james",870));
		lhm.put(5, new Book(2,"AngularJs","cliffton",550));
		lhm.put(3, new Book(3,"SQL","cooper",230));
		lhm.put(8, new Book(4,"VM ware","andrew",780));
		lhm.put(8, new Book(4,"VM ware","andrew",780));
		lhm.put(18, null);
		lhm.put(11,null);
		lhm.put(null, new Book(4,"VM ware","andrew",780));
		lhm.put(null, new Book(4,"ubuntu","andrew",780));
		lhm.put(20, new Book(4,"ubuntu","andrew",780));
		
		
        for (Map.Entry<Integer, Book> m : lhm.entrySet()) {
			
			System.out.println("key is :"+m.getKey()+"\t"+"Value is :"+m.getValue());
			
		}
	
	
	
	}
	
	

}
