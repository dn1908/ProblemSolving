package com.prepare.day;

public class RobHouses {

	 public static int rob(int[] nums) {
	        //either rob nth or n-1 th
	        //if nth = A(n) + f(n-2);
	        //if n-1 = f(n-1);
	        
	        int n = nums.length;
	        int dp[] = new int[n];
	        
	        if(n == 0)
	            return 0;
	        if(n==1)
	            return nums[0];
	        
	        dp[0] = nums[0];
	        dp[1] = Math.max(nums[0], nums[1]);
	        for(int i = 2; i< n; i++)
	             dp[i] = Math.max(dp[i-2] + nums[i], dp[i-1]);
	        
	        return dp[n-1];
	    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input =  {1,2,3,1};
		System.out.println(rob(input));
	}

}
