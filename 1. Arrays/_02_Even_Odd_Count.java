// Challenge 2: Count Even and Odd Numbers
// Easy
// Arrays · Loops · Conditionals

// DSA Task
// Given an array of integers, count how many numbers are even and how many are odd. Return both counts.
// Example Input/Output
// Input:
// [1, 2, 3, 4, 6]


// Output:
// Even: 3
// Odd: 2

public class _02_Even_Odd_Count {
    public void evenOrOdd(int nums[]){
        int n = nums.length;
        int evenCount = 0;
        int oddCount = 0;
        for(int i=0;i<n;i++){
            if(nums[i] % 2 == 0){
                evenCount++;
            }
            else{
                oddCount++;
            }
        }
        System.out.println(evenCount);
        System.out.println(oddCount);
    }  
}
