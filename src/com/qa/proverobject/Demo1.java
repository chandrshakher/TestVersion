package com.qa.proverobject;

public class Demo1 {
	 public static void m1(){
		 System.out.println("chandra");
	 }
}
class chandra extends Demo1{
public void m2(){
	m1();
}

	public static void main(String[] args) {
		chandra ch=new chandra();
		ch.m2();
	}
}
