package com.qa.practise;

public class FabnpoicSer {
  public static void main(String[] args) {
	    int n=10; int t1=0; int t2=1;
	    
	    for(int i=1; i<n; i++){
	    	    System.out.println(t1);
	    	       int sum=t1+t2;
	    	        t1=t2;
	    	        t2=sum;
	    }
}
  
}
