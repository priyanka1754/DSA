// Fair Splits – Count Even Difference Partitions

// Problem Description

// You are given an integer array a of length n.
// We define a split as dividing the array into two non-empty parts:
// Left part → from index 0 to i
// Right part → from index i+1 to n-1
// For each possible split, calculate the absolute difference between the sum of the left part and the sum of the right part.
// 👉 A split is considered fair if this difference is an even number.
// Your task is to count how many fair splits exist in the given array.

// Example 1
// Input:
// a = [10, 10, 3, 7, 6]

// Output:
// 4

//My Approch
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) {
        int a[]={};
        int n=a.length;
        if(n<2){System.out.println(0); return;}
        int nums[]=new int[n];
        nums[0]=a[0];
        for(int i=1;i<n;i++){
            nums[i]=a[i]+nums[i-1];
        }
        int c=0;
        int j=n-1;
        for(int i=0;i<n-1;i++){
            int diff=Math.abs(nums[i]-(nums[j]-nums[i]));
            if(diff%2==0){
                c++;
            }
        }
        System.out.println(c);
    }
}


//another approch by chatgpt
import java.util.*;

class Main {
    public static void main(String[] args) {
        int a[] = {10, 10, 3, 7, 6};
        int n = a.length;

        // calculate total sum
        int totalSum = 0;
        for (int val : a) totalSum += val;

        int leftSum = 0, c = 0;
        for (int i = 0; i < n - 1; i++) { // split only before the last element
            leftSum += a[i];
            int rightSum = totalSum - leftSum;
            int diff = Math.abs(leftSum - rightSum);
            if (diff % 2 == 0) {
                c++;
            }
        }

        System.out.println(c);
    }
}
