package com.qa.practise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class map {
public static void main(String[] args) {
	   HashMap<String , Integer> hashmap=new HashMap();  
	          hashmap.put("chandra", 1);
	          hashmap.put("ramesh", 2);
	          hashmap.put("dinesh", 3);
	          hashmap.put("abhi", 4);
	          hashmap.put("raja", 5);
	            // we get key value pair 
	          Set<Entry<String, Integer>> set=  hashmap.entrySet();
	                            hashmap.put("durga", 9);
	                          
	                            
	              for(Entry<String, Integer> any: set){
	            	    
	            	      System.out.println(any.getKey()); ;
	            	      System.out.println(any.getValue()); ;
	              }
	
}
}
