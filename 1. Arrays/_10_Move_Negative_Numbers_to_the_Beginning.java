// Challenge 10: Move Negative Numbers to the Beginning
// Easy
// Arrays · Two Pointers · Conditionals

// DSA Task
// Given an array of integers, rearrange it so that all negative numbers appear before all non-negative numbers.

// The relative order of elements does not need to be preserved.
// Example 1
// Input:
// [3, -1, 4, -5, 0, -2]


// Output:
// [-1, -5, -2, 3, 0, 4]


public class _10_Move_Negative_Numbers_to_the_Beginning {
    public void moveNegative(int nums[]) {
        int n = nums.length; 
        int slow = 0; 
        for(int fast=0;fast<n;fast++){ 
            if(nums[fast] < 0){ 
                int temp = nums[fast]; 
                nums[fast] = nums[slow]; 
                nums[slow] = temp; 
                slow++; 
            } 
        } 
    }
}
