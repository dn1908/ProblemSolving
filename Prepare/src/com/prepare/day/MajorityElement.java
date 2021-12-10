package com.prepare.day;

import java.util.HashMap;
import java.util.Map.Entry;

public class MajorityElement {

	  public int majorityElement(int[] nums) {
	        HashMap<Integer,Integer> map =  new HashMap<>();
	        Integer majority =  new Integer(0);
	        
	        Integer temp =  new Integer(0);
	        for(int item : nums) {
	            if(map.containsKey(item))
	                map.put(item, map.get(item) + 1);
	            else
	                map.put(item, 1);
	        }
	            for(Entry<Integer, Integer> entry : map.entrySet()) {
	                if(entry.getValue() > temp) {
	                    temp = entry.getValue();
	                    majority = entry.getKey();
	                    }
	            }
	            return majority;
	    }
	  
	  public static int firstUniqChar(String s) {
	        int letters[] =  new int[26];
	       // int result;
	        for(int i = 0; i < s.length(); i++) {
	            letters[s.charAt(i) - 'a'] ++;
	        }
	        
	        for(int i = 0; i< s.length() ; i++) {
	        	if(letters[s.charAt(i) - 'a'] == 1)
	                return  i;
	        }
	        
	        return -1;
	        
	    }
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(firstUniqChar("leetcode"));
	}

}
