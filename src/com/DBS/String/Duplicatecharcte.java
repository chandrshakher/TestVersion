package com.DBS.String;

public class Duplicatecharcte {
   public static void main(String[] args) {
	  String str="harikrishana";
	      char[] str1 =  str.toCharArray();
	   for(int i=0; i<=str1.length-1; i++){
		     for(int j=i+1; j<=str1.length-1; j++){
		    	 if(str1[i]==str1[j] && i!=j){
		    		 str1[j]=0;
		    	 }
		     }
	   }
	   for(int i=0; i<=str1.length-1;i++){
		   System.out.print(str1[i]);
	   }
}
}
