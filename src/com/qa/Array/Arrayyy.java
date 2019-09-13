package com.qa.Array;

public class Arrayyy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int x[]= {3,10,0,4,5};
       for(int i=1; i<x.length;i++){
    	       //x[i]=i;
    	       i=x[i];
    	       System.out.println(i);
       }
	}

}
