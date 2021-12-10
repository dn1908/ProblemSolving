package com.prepare.day;

import java.util.HashMap;

public class Anagram {
	
	    public static boolean isAnagram(String str, String t) {
	        HashMap<Character, Integer> map =  new HashMap<Character,Integer>();
	        
	        for(int i = 0; i< str.length(); i++) {
	            if(map.containsKey(str.charAt(i)) && map.get(str.charAt(i)) > 0 )
	                map.put(str.charAt(i),map.get(str.charAt(i))+1);
	            else
	                map.put(str.charAt(i), 1);   
	        }
	        
	        for(int i=0; i < t.length(); i++) {
	            if(map.containsKey(t.charAt(i)))
	            {
	                if(map.get(t.charAt(i)) > 0)
	                    map.put(t.charAt(i),map.get(t.charAt(i))-1);
	                else return false;
	            }
	            else
	                return false;
	        }
	        Integer zero = new Integer(0);
	        
	        for(Integer entry : map.values()){
	        	if(!zero.equals(entry))
	        		return false;
	        }
	        
	        return true;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(isAnagram("ab", "a"));
	}

}
