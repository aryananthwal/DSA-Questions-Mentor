// Challenge 13: Two Sum
// Easy
// Arrays · Loops · Searching

// DSA Task
// Given an array of integers nums and an integer target, return the indices of two distinct elements whose sum equals target.

// Assume exactly one valid pair exists. You may not use the same element twice.
// Example 1
// Input:
// nums = [2, 7, 11, 15]
// target = 9


// Output:
// [0, 1]


// Explanation: nums[0] + nums[1] = 2 + 7 = 9.


public class _13_Two_Sum {
    public int[] twoSum(int nums[], int target){
        int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i] + nums[j] == target){
                    return new int[] {i, j};
                }
            }
        }
        return new int[]{};
    }
}