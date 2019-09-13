package com.qa.practise;

public class SortingValue {
 public static void main(String[] args) {
	      String s1="dewangichandra";
	          char[] ch =s1.toCharArray();
	                    for(int i=0; i<ch.length; i++){
	                    	for(int j=i+1; j<ch.length; j++){
	                    		    if(ch[i]<=ch[j]){
	                    		    	int temp=ch[i];
	                    		    	ch[i]=ch[j];
	                    		    	 ch[j]=(char)temp;
	                    		    }
	                    		    
	                    	}
	                    }
	                    for(int i=0; i<ch.length; i++){
	                    	   System.out.println(ch[i]);
	                    }
}
}
