// https://hive.smartinterviews.in/contests/smart-interviews-basic/problems/odd-and-even-sum

// Odd and Even Sum

import java.io.*;
import java.util.*;

public class Main {
    public static int[] OddEvenSum(int a[],int i){
        if(i==a.length) return new int[]{0,0};
        int rest[]=OddEvenSum(a,i+1);
        if(a[i]%2==0) rest[1]+=a[i];
        else rest[0]+=a[i];
        return rest;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int even=0;
        int odd=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int ans[]=OddEvenSum(a,0);
        System.out.print(ans[0]+" "+ans[1]);
    }
}


import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int even=0;
        int odd=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(a[i]%2==0){
                even+=a[i];
            }else{
                odd+=a[i];
            }
        }
        System.out.print(odd+" "+even);
    }
}
