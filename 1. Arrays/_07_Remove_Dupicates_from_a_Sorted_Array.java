// Challenge 7: Remove Duplicates from a Sorted Array
// Easy
// Arrays · Two Pointers

// DSA Task
// Given a sorted array, remove duplicate elements in place so that each distinct element appears only once.

// Return the number of distinct elements, k. The first k positions of the array must contain the distinct elements in sorted order. The remaining positions can contain anything.
// Example 1
// Input:
// [1, 1, 2, 2, 3]


// Output:
// k = 3
// Array = [1, 2, 3, _, _]


public class _07_Remove_Dupicates_from_a_Sorted_Array {
    public int removeDuplicates(int nums[]){
        int n = nums.length;
        int slow = 0;
        for(int fast = 1;fast<n;fast++){
            if(nums[fast] != nums[slow]){
                slow++;
                nums[slow] = nums[fast];
            }
        }
        return slow+1;
    }
}
