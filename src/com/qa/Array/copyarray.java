package com.qa.Array;

public class copyarray {
public static void main(String[] args) {
	    int []x={3,3,4,90,100};
	      int [] copy=new int[x.length];
	        for(int i=0; i<copy.length; i++){
	        	   copy[i]=x[i];
	        	   // if we will try adanceloop then we will get output different
	        	   System.out.println(copy[i]);
	        }
}
}
