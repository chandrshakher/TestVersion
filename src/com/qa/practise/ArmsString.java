package com.qa.practise;

public class ArmsString {
	public static void main(String[] args) {
		int n = 113;
		int rem;
		int storevalue = 0;
		int number=n;
		while (n > 0) {
			rem = n % 10;
			storevalue = storevalue + rem * rem * rem;
			n = n / 10;
		}
           if(storevalue==number){
        	    System.out.println("armsstrong"+storevalue);
           } 
           else{
        	   System.out.println("not");
           }
	}
}
