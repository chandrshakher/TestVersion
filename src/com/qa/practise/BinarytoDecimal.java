package com.qa.practise;

public class BinarytoDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int n=11001;
         int store=0;
         int base=1;;
         int item;
               while(n>0){
            	   int rem=n%10;
            	     store=store+rem*base;
            	     n=n/10;
            	       base=base*2;
               }
               System.out.println(store);
	}

}
