// Challenge 5: Check if an Array Is Sorted
// Easy
// Arrays · Loops · Conditionals

// DSA Task
// Given an array of integers, determine whether it is sorted in non-decreasing order. Return true if it is sorted; otherwise, return false.
// Example 1
// Input:
// [1, 2, 2, 4, 7]


// Output:
// true


public class _05_Check_if_an_Array_is_Sorted {
    public boolean isSorted(int nums[]){
        int n = nums.length;
        for(int i=1;i<n;i++){
            if(nums[i] < nums[i-1]){
                return false;
            }
        }
        return true;
    }
}
