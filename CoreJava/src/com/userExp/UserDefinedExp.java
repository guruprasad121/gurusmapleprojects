package com.userExp;

@SuppressWarnings("serial")
public class UserDefinedExp extends Exception {
	
	private int price;

	public UserDefinedExp(int price) {
		super();
		this.price = price;
	}

	public String toString() {
		return "The price should not be" + price+ "]";
	}
	
	

}
