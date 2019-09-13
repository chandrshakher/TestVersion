package com.qa.Array;

public class Norma {
public static void main(String[] args) {
	

int x[]={2,3,4,90,10,2};

int y[]=new int [x.length];
       for(int i=0; i<x.length; i++){
    	   
	   //System.out.println(y[i]);
	   y[i]=x[i];
	   System.out.println(y[i]);
}

}
}