package com.qa.practise;

public class misisinumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] x={1,3,5,7,10};
		 
    int y[] =new int [x.length];
            for(int i=0; i<x.length; i++){
            	   y[i]=x[i];
            	   System.out.println(y[i]);
            }
            for(int i=1; i<=y.length-1; i++){
            	   if(y[i]>0 || y[i]<10){
            		  System.out.println(i); 
            	   }
            }
	}

}
