package com.qa.practise;

public class Palidroimstrin {
	public static void main(String[] args) {
		String s1 = "mom";
		String store ="";
		for (int i = s1.length() - 1; i >= 0; i--) {
			store = store + s1.charAt(i);

		}
		if (s1.equals(store)) {
			System.out.println("plaidroim" + store);
		} else {
			System.out.println("not plaidrom");
		}
	}
}
