// Subarray Triplets – Count Special Triplets in Subarrays

// Problem Description

// You are given an integer array a of length n and an integer k (window size).
// Your task is to slide a window of size k across the array and count how many subarrays of size k contain a special triplet that satisfies the following condition:
// For every valid subarray of size k, check the first two elements (a[i] and a[j], where j = i + k - 1 is the last element of that subarray).
// If their sum equals the middle element (a[i+1]), then that subarray forms a special triplet.
// Return the total count of such special triplets across all subarrays of size k.

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) {
        int a[]={1,2,1,3,5,2,4,2};
        int n=a.length;
        int k=3;
        int j=k-1;
        int c=0;
        for(int i=0;i<=n-k;i++){
            if(a[i]+a[j]==a[i+1]){
                c++;
            }
            j++;
        }
        System.out.println(c);
    }
}

//other approch to fing subArrayTriplets..
public class SubarraySumTriplets {
    public static int countTriplets(int[] arr, int N) {
        int count = 0;
        for (int i = 0; i <= N - 3; i++) {
            if (arr[i] + arr[i + 2] == arr[i + 1]) {
            count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 5, 2, 4, 2};
        int N = 8;
        System.out.println(countTriplets(arr, N));
    }
}

//if k is changing then, the above code will not work.
import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        int a[] = {1, 2, 1, 3, 5, 2, 4, 2};
        int n = a.length;
        int k = 3; // you can change this

        if (k % 2 == 0 || k > n) {
            System.out.println(0); // not valid (needs odd k and k ≤ n)
            return;
        }

        int c = 0;
        int midOffset = (k - 1) / 2;

        for (int i = 0; i <= n - k; i++) {
            int left = a[i];
            int right = a[i + k - 1];
            int middle = a[i + midOffset];
            if (left + right == middle) {
                c++;
            }
        }
        System.out.println(c);
    }
}
