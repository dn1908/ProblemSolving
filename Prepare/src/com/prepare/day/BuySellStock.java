package com.prepare.day;

public class BuySellStock {
	
	public static int maxProfit(int[] prices) {
	int min = prices[0];
    int profit = 0;
    for(int item : prices) {
         profit = Math.max(profit, item - min);
         min = Math.min(item, min);
     }
    return profit;
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {7,1,5,3,6,4};
		System.out.println(maxProfit(input));
	}
}
