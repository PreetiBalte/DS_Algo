package com.preeti.ds_algo;

public class ReverseString {
	public static void main(String[] args) {
	
		String str = "Testing";
		
		/*StringBuilder Method */
		
		StringBuilder reverseString = new StringBuilder();
		
		reverseString.append(str);
		
		reverseString.reverse();
		
		System.out.println(reverseString);
	}

}
