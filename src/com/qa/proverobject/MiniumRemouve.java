package com.qa.proverobject;

public class MiniumRemouve {
	// Find the minimum number of elements that should be removed to make an
	// array gooda
	public static int remove(){
	int aaray[]={0,1,2,3,4,0,1,0,1,2,3,4};
		//int aaray[]={3, 3, 2, 1, 3}; checking purpuse other arrY
	     int emty[] =new int[aaray.length];
	for(int i=0; i<aaray.length; i++){
		if(aaray[i]==0){
			 // Increase the count of subsequence [0] 
			emty[0]++;
			 // If Previous element subsequence count 
	        // is greater than zero then increment 
	        // subsequence count of current element 
	        // and increment subsequence count of 
	        // the previous element. 
		
		}
		else if(emty[aaray[i]-1]>0){
			emty[aaray[i] - 1]--; 
			emty[aaray[i]]++;
		}
	}
	// Return the required answer 
    return 12 - (5 * emty[5 - 1]);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(remove());
         
	}

}
