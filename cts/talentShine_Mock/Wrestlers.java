// Problem Statement:
// There are [ N ] wrestlers standing in a row,with their weights given in an integer array [ w ]. 
// You have to find if there is a contiguous segment of exactly [ k ] wrestlers with the same weight.
// Your task is to find such a segment and return an integer value representing the sum of these [ k ] weights.
// If there are multiple such segments, return the sum of the first one encountered. 
// If no such segment exists, return [-1].
// Input Specification:
// Input 1: An integer value [ N ] representing the number of wrestlers.
// Input 2: An integer array [ w ] of size [ N ], representing the weights of the wrestlers.
// Input 3: An integer value [ k ] representing the number of consecutive wrestlers with the same weight to find.
// Output Specification:
// Return an integer value representing the sum of these [ k ] weights.
// If there are multiple such segments, return the sum of the first one encountered. If no such segment exists, return [-1].
// Input:
// 8
// 180 180 200 200 200 200 220 220
// 3
// Output:
// 600

import java.io.*;
import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int w[]=new int[n];
        for(int i=0;i<n;i++){
            w[i]=sc.nextInt();
        }
        int flag=0;
        int ans=0;
        int k=sc.nextInt();
        for(int i=0;i<n-k;i++){
            flag=0;
            for(int j=i;j<k;j++){
                if(w[i]!=w[j]){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                ans=w[i]*k;
                System.out.println(ans);
                break;
            }
        }
         if(flag==1)System.out.println(-1);
    }
}



//
import java.io.*;
import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int w[]=new int[n];
        for(int i=0;i<n;i++){
            w[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int c=1;
        for(int i=1;i<n;i++){
            if(w[i]==w[i-1]){
                c++;
            }else{
                c=1;
            }
            if(c==k){
                System.out.println(w[i]*k);
                return;
            }
        }
        System.out.println(-1);
    }
}
