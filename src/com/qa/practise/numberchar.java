package com.qa.practise;

public class numberchar {
public static void main(String[] args) {
	   String s1="chandra13";
	     for(int i=0; i<s1.length(); i++){
	    	        if(Character.isDigit(s1.charAt(i))){
	    	        	System.out.println(s1.charAt(i));
	    	        }
	     }
	   
}
}
