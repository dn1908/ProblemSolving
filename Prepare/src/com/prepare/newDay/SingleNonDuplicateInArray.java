package com.prepare.newDay;

public class SingleNonDuplicateInArray {

	//Find the single non-duplicate item in the array passed in.
	 public static int singleNumber(int[] nums) {
	        int result = nums[0];
	        
	        if(nums.length == 1)
	            return result;
	        
	        for(int i =1; i<nums.length; i++)
	            result = result ^ nums[i]; // 0100 4
	        							//    0001 ==> 0101 5
	        										// 0010 ===> 0111 7
	        										// 			 0001 ====> 0110 6
	        													//			0010 ===> 0100 4
	    
	    return result;
	    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input  = {4,1,2,1,2};
		singleNumber(input);
	}

}
