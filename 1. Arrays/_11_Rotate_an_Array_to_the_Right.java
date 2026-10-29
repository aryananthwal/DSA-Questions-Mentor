// Challenge 11: Rotate an Array to the Right
// Easy
// Arrays · Loops · Reversal

// DSA Task
// Given an array of integers and a non-negative integer k, rotate the array to the right by k positions.

// If k is greater than the array length, rotate by the equivalent number of positions.
// Example 1
// Input:
// nums = [1, 2, 3, 4, 5, 6, 7]
// k = 3


// Output:
// [5, 6, 7, 1, 2, 3, 4]


public class _11_Rotate_an_Array_to_the_Right {
    // public void rorateArray(int nums[], int k){
    //     int n = nums.length;
    //     k = k % n;
    //     for(int i=0;i<k;i++){
    //         int last = nums[n-1];
    //         for(int j=n-1;j>0;j--){
    //             nums[j] = nums[j-1];
    //         }
    //         nums[0] = last;
    //     }
    // }

    // Optimized Approach (Using Reverse Logic)
    public void reverse(int nums[], int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public void rotateArray(int nums[], int k){
        int n = nums.length;
        k = k % n;
        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
    }
}
