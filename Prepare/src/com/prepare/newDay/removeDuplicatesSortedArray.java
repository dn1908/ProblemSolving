package com.prepare.newDay;

public class removeDuplicatesSortedArray {

	//Remove duplicates from a sorted Array passed in 
    public static int removeDuplicates(int[] nums) {
    	       int i = 0 , j=1;
    	        while(j < nums.length) {
    	            if(nums[i] == nums[j])
    	                j++;
    	            else {
    	                i++;
    	                nums[i] = nums[j];
    	                j++;
    	            } 
    	        }
    	         return i+1;   
    	    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {0,0,1,1,1,2,2,3,3,4};
		removeDuplicates(input);
	}

}
