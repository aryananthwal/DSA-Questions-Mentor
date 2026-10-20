// Challenge 3: Reverse an Array
// Easy
// Arrays · Loops · Variables

// DSA Task
// Given an array of integers, reverse its order and return or print the reversed array.
// Example 1
// Input:
// [1, 2, 3, 4, 5]


// Output:
// [5, 4, 3, 2, 1]

public class _03_Reverse_An_Array {
    public int[] reverse(int nums[]){
        int n = nums.length;
        int left = 0;
        int right = n-1;
        while(left < right){
            int temp = nums[right];
            nums[right] = nums[left];
            nums[left] = temp;
            left++;
            right--;
        }
        return nums;
    }
}
