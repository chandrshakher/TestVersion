package com.qa.practise;

public class Stringsdds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abc";
		String s2= "abc";
		 
		String s3 = new String("abc");
		 System.out.println(s2.intern());
		s3 = s3.intern();
		System.out.println(s1==s3);
		System.out.println(s1==s2);
	}

}
