package com.qa.proverobject;

public class Learninlogicuickshort {
	public static void quicshor( int []x, int low, int high){
		    if(low<high){
		  partion(x, low,  high);
		    quicshor(x, low, high);
		    quicshor(x, high+1, low);
		    	
		    }
	}
	public static void printarr(int [] x){
		for(int i=0; i<x.length; i++){
			System.out.println(x[i]);
		}
	}

	public static void partion(int []x , int low, int high){
		int pivot=x[low];
		int i=low;
		int j=high;
		for(i=low ; i<high; i++){
			 if(x[i]>=pivot && x[j]<=pivot && i<j){
				 i++;
				 j--;
				 int temp=x[i];
				 x[j]=x[i];
				 x[j]=temp;
	}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] x={10,5,8,12,15,6,3,9,16};
partion( x, 0, x.length-1 );
printarr(x);
		 
	}

}
