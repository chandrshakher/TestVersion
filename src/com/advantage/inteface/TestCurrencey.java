package com.advantage.inteface;

public class TestCurrencey {
	public Currencey currencyType(String str1){
		  if(str1.equalsIgnoreCase("india")){
			    return new Indiaaa();
		  }
		  else if(str1.equalsIgnoreCase("US")){
			  
			  return new US();
		  }
		 throw new RuntimeException("indvaid");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
