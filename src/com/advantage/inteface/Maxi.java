package com.advantage.inteface;

public class Maxi {

	public static void main(String[] args) {
		int [] x={10, 100,4000, 30,20};
		    int maxi=x[0];
		    int min=x[0];
		    
		    for(int i=0; i<x.length; i++){
		    	if(x[i]>maxi){
		    		maxi=x[i];
		    		
		    	}
		    	else if(x[i]<min){
		    		min=x[i];
		    		
		    	}
		    }
		    
		    System.out.println(maxi);
            System.out.println(min);
	}

}
