package com.qa.practise;

public class Duplicatevalue {
public static void main(String[] args) {
	    int x[]= {0,30,20,20,20,2,2,3,1,1};
	    for(int i=0; i<=x.length-1; i++){
	    	  for(int j=i+1; j<x.length; j++){
	    		    if(x[j]==0){
	    		    	  System.out.println(x[j]);
	    		    }
	    	  }
	    }
}
}
