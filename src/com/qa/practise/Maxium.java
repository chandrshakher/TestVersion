package com.qa.practise;

public class Maxium {

	public static void main(String[] args) {
		int[] x = { 5, 2, 3, 6, 100, 7, 3, 900,900};

		for (int i = 0; i < x.length; i++) {
			for (int j = i + 1; j < x.length; j++) {
				if (x[i] <x[j] ) {
					int temp = x[i];
					x[i] = x[j];
					x[j] = temp;
				}
				
			}
			}
			
			System.out.println("maxium number "+x[0]);
					System.out.println("second max numer"+x[1]);
				}
			

		}
	
