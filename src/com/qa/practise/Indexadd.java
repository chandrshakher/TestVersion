package com.qa.practise;

public class Indexadd {
public static void main(String[] args) {
	int[]x={5,2,3,6,1,7};
	int index1;
	int index2;
	          for(int i=0; i<=x.length; i++){
	        	  for(int j=i+1; j<=x.length-1; j++){
	        		    int sum=x[i]+x[j];
	        		     if(sum==7){
	        		    	index1=i;
	        		    	index2=j;
	        		    	System.out.println(sum+" "+index1 +" "+index2);
	        		     }
	        	  }
	          }
}
}
