package com.qa.proverobject;
public class Tester {
	public void m1() {
		System.out.println("chandra");
	}
}

class Chile extends Tester {
	public static void main(String[] args) {
		Tester ts = new Chile();
		ts.m1();
		
	}
}