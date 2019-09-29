package com.qa.practise;

public class Indexadding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
               int x[]={2,3,5,4,1,6};
                for(int i=0; i<x.length; i++){
                	for(int j=i+1; j<x.length; j++){
                		  int sum=x[i]+x[j];
                		   if(sum==7){
                			   int index=i;
                			   int index1=j;
                			   System.out.println(index + "" + index1);
                		   }
                	}
                }
	}

}
