package com.qa.proverobject;

public class Parent {
	Parent(){
		System.out.println("parent"+this);
	  
	
	}
}
 class Child extends Parent{
	 Child(){
		 System.out.println("child"+ this);
	 }
}
