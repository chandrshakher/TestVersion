package com.qa.practise;

public class Missssss {

	public static void main(String[] args) {
		//int[] input = {9,1,1,1,1,3,6,88,7};
		int[] input = {8,1, 1, 1, 1, 1, 1, 9, 9, 7 };
		int[] register = new int[input.length];
		for (int i : input) {
			
			register[i] = input[i];
			System.out.print(register[i]);
		}
		System.out.println("misisng number");
	for (int i = 1; i<register.length; i++) {
			if (register[i] == 0) {
				
				System.out.println(i);
			}
		}
	}

}
