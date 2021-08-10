package com.qa.proverobject;

public class Binarytree {
	public static void function(int test){
		      if(test<1){
		    	return;  
		      }
		      else{
		    	  System.out.print("%d"+ test);
		    	  function(test-1);
		    	  System.out.print(test);
		      }
		return;
	}

	public static void main(String[] args) {
		function(3);

	}

}
