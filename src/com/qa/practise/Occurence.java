package com.qa.practise;

import java.util.HashMap;

public class Occurence {
public static void main(String[] args) {
	  String s1="chan3333ddd222w11";
	  HashMap<Character , Integer> hashmap=new HashMap<Character, Integer>();
	      
	       for(int i=0; i<s1.length(); i++){
	    	     if(hashmap.containsKey(s1.charAt(i))){
	    	    	       hashmap.put(s1.charAt(i), hashmap.get(s1.charAt(i))+1);    
	    	     }
	    	     else if(!hashmap.containsKey(s1.charAt(i))){
	    	    	 hashmap.put(s1.charAt(i), 1);
	    	     }
	    	       
	       }
	       System.out.println(hashmap);
}
}
