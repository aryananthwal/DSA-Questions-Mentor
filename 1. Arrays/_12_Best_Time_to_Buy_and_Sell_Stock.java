// Challenge 12: Best Time to Buy and Sell Stock
// Now that we've optimized Challenge 11, we can move on.
// Easy
// Arrays · Loops · Conditionals

// DSA Task
// Given an array prices, where prices[i] is a stock's price on day i, find the maximum profit you can make by buying once and selling on a later day.

// If no profit is possible, return 0.
// Example 1
// Input:
// [7, 1, 5, 3, 6, 4]


// Output:
// 5


// Buy at 1 and sell later at 6.


public class _12_Best_Time_to_Buy_and_Sell_Stock {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int minValue = prices[0];
        int maxDifference = 0;
        for(int i=1;i<n;i++){
            if(prices[i] > minValue){
                maxDifference = Math.max(prices[i] - minValue, maxDifference);
            }
            else{
                minValue = prices[i];
            }
        }
        return maxDifference;
    }
}