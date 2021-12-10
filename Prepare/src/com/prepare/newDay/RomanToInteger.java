package com.prepare.newDay;

import java.util.HashMap;

public class RomanToInteger {

	static int getRomanToInt(String roman) {
		int ans = 0;
		HashMap<Character,Integer> map = new HashMap<>();
		
		map.put('X', 10);
		map.put('V', 5);
		map.put('I', 1);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		//MCMXCIV
		
		for(int i = 0; i < roman.length(); i++) {
			char ch = roman.charAt(i);
			if(i>0 && map.get(ch) > map.get(roman.charAt(i-1)))
				ans +=  (map.get(ch)- (2*map.get(roman.charAt(i-1))));
			else 
				ans += map.get(ch);
		}
		
		return ans;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "MCMXCIV";
		
		System.out.println(getRomanToInt(input));
	}

}
