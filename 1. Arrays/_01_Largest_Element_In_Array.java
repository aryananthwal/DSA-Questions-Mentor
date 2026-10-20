// Challenge 1: Find the Largest Element
// Easy
// Arrays · Loops · Conditionals

// DSA Task
// Given an array of integers, find and return the largest element in the array.
// Example Input/Output
// Example 1

// Input:
// [3, 7, 2, 9, 4]


// Output:
// 9


public class _01_Largest_Element_In_Array {
    public int maxElement(int nums[]) { 
        int n = nums.length; 
        int max = nums[0]; 

        for(int i = 1; i < n; i++){ 
            if(nums[i] > max){ 
                max = nums[i];
            }
        } 
        return max;
    }
}


