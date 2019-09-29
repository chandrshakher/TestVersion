package com.qa.practise;

public class Numberpalidro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int n=25;
           int rem;
           String stor="";
           
           
                while(n>0){
                	   rem=n%2;
                	   stor=stor+rem;
                	   n=n/2;
                }
          System.out.println(stor);
	}

}
