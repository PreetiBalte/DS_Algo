package com.preeti.ds_algo;

import java.util.HashMap;

public class CountChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Using HashMap */
		
		String str = "PREETI";
		
		HashMap<Character, Integer> charCount = new HashMap();
		
		for(int i = 0; i<str.length()-1; i++) {
			if(charCount.containsKey(str.charAt(i))) {
				int count = charCount.get(str.charAt(i));
				charCount.put(str.charAt(i), ++count);
			} else {
				charCount.put(str.charAt(i),1);
			}
		}
		
		System.out.println(charCount);
		
	}

}
