// Challenge 6: Move All Zeros to the End
// Easy
// Arrays · Loops · Two Pointers

// DSA Task
// Given an array of integers, move all zeros to the end while preserving the relative order of non-zero elements.

// Modify the array in place.
// Example 1
// Input:
// [0, 1, 0, 3, 12]


// Output:
// [1, 3, 12, 0, 0]


public class _06_Move_All_Zeroes_to_the_End {
    public void moveZeroes(int nums[]){
        int n = nums.length;
        int slow = 0; 
        for (int fast = 0; fast < n; fast++) {
            if (nums[fast] != 0) {
                int temp = nums[fast];
                nums[fast] = nums[slow];
                nums[slow] = temp;
                slow++;
            }
        }
    }
}
