// Problem Statement:
// There is a library with N shelves labeled 1 to N, 
// each containing A[i] books. You can only collect books from shelves with prime-numbered labels (i.e., index 2, 3, 5, 7, ...).
// For each of these shelves, you can collect at most K books per shelf during a single visit.
// Return the maximum total number of books you can collect during one visit.
// Input:An integer N (number of shelves)
//   An integer K (maximum books per shelf per visit)
//   An integer array A (number of books on each shelf, 0-based indexing for array)
// Output:An integer: Maximum number of books you can collect in one visit, following all rules.

import java.util.*;

class Main {
    public static boolean isPrime(int n){
        if(n < 2) return false;
        for(int i = 2; i * i <= n; i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int totalBooks = 0;
        for(int i = 0; i < n; i++){
            if(isPrime(i+1)){
                totalBooks += Math.min(a[i], k);
            }
        }
        System.out.println(totalBooks);
    }
}
