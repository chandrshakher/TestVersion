package com.qa.practise;

public class Decimal {
public static void main(String[] args) {
	        int n=25;
	      String store="";
	        while(n>0){
	        	int rem=n%2;
	        	store=store+rem;
	        	n=n/2;
	        }
	       // System.out.print(store);
	       for(int i=store.length()-1; i>=0; i--){
	    	   System.out.print(store.charAt(i));
	       }
	         
}
}
