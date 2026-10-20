// Challenge 4: Find the Second Largest Distinct Element
// Easy
// Arrays · Loops · Conditionals

// DSA Task
// Given an array of integers, find the second largest distinct element.

// If no second largest distinct element exists, return -1.
// Example 1
// Input:
// [12, 35, 1, 10, 34, 1]


// Output:
// 34

public class _04_Find_the_Second_Largest_Distinct_Element {
    public int secondLargest(int nums[]){
        int n = nums.length;
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i] > largest){
                secondLargest = largest;
                largest = nums[i];
            }
            else if(nums[i] > secondLargest && nums[i] != largest){
                secondLargest = nums[i];
            }
        }
        if(secondLargest == Integer.MIN_VALUE){
            return -1;
        }
        return secondLargest;
    }
}



// Problem: Integer.MIN_VALUE is a valid Java integer. If the array is:
// [5, Integer.MIN_VALUE]
// the correct answer is Integer.MIN_VALUE, but your final check incorrectly returns -1.


// public class _04_Find_the_Second_Largest_Distinct_Element {

//     public int secondLargest(int[] nums) {
//         if (nums == null || nums.length < 2) {
//             return -1;
//         }

//         int largest = 0;
//         int secondLargest = 0;
//         boolean foundLargest = false;
//         boolean foundSecond = false;

//         for (int num : nums) {
//             if (!foundLargest || num > largest) {
//                 if (foundLargest) {
//                     secondLargest = largest;
//                     foundSecond = true;
//                 }

//                 largest = num;
//                 foundLargest = true;
//             } else if (num < largest &&
//                        (!foundSecond || num > secondLargest)) {
//                 secondLargest = num;
//                 foundSecond = true;
//             }
//         }

//         return foundSecond ? secondLargest : -1;
//     }
// }