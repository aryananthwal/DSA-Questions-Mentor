// Challenge 9: Find the Maximum Difference
// Easy
// Arrays · Loops · Conditionals

// DSA Task
// Given an array of integers, find the maximum difference nums[j] - nums[i] where j > i.

// The larger element must appear after the smaller-index element. If no positive difference exists, return 0.
// Example 1
// Input:
// [7, 1, 5, 3, 6, 4]


// Output:
// 5


// Explanation: 6 - 1 = 5.


public class _09_Find_the_Maximum_Difference {
    public int maxDifference(int nums[]){
        int n = nums.length;
        int minValue = nums[0];
        int maxDifference = -1;
        for(int i=1;i<n;i++){
            if(nums[i] > minValue){
                maxDifference = Math.max(maxDifference, nums[i] - minValue);
            }
            else{
                minValue = nums[i];
            }
        }
        return maxDifference;
    }
}