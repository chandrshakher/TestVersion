package com.DBS.String;

public class Repeat {
public static void main(String[] args) {
	 String str="mosdfsm";
	 String store="";
	     for(int i=str.length()-1; i>=0; i--){
	    	      store=store+str.charAt(i);
		    }
	     if(store.equals(str)){
	    	 System.out.print(store);
	     }
	     else{
	    	 System.out.println(store);
	     }
	 }
}

