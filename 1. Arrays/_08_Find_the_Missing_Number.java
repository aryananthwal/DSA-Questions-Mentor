// Challenge 8: Find the Missing Number
// Easy
// Arrays · Loops · Arithmetic

// DSA Task
// You are given an array containing n distinct numbers from the range 0 to n, inclusive. Exactly one number from this range is missing.

// Find and return the missing number.
// Example 1
// Input:
// [3, 0, 1]


// Output:
// 2


// public int missingNumber(int nums[]){
//     int n = nums.length;
//     Arrays.sort(nums);
//     for(int i=0;i<n;i++){
//         if(nums[i] != i){
//             return i;
//         }
//     }
//     return n;
// }


// More Efficient Approach (Using Math Logic)
public class _08_Find_the_Missing_Number {
    public int missingNumber(int nums[]){
        int n = nums.length;
        int sum = 0;
        for(int i=0;i<=n;i++){
            sum += i;
        }
        int existingSum = 0;
        for(int i=0;i<n;i++){
            existingSum += nums[i];
        }
        return sum - existingSum;
    }
}
