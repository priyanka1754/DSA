// Problem Statement:
// You have a jar which initially contains [ N ] marbles, in any order.
// You can perform the following operations any number of times (in any order),
// as long as at least one marble remains in the jar:Take out [ A ] marbles from the jar.
// Take out [ B ] marbles from the jar.Your task is to compute and
// return the total number of unique positive marble counts that can be left behind by performing these operations,
// including the initial number of marbles. (You must never let the jar become empty or negative.)
// Input:
// An integer [ N ] (initial number of marbles)
// An integer [ A ] 
// An integer [ B ]
// Output:
// Print the total number of unique positive numbers of marbles that can be left in the jar (including [ N ]),
// by performing the allowed moves in any order and any number of times.
// Input:
// 4
// 1
// 2
// Output:
// 4

import java.io.*;
import java.util.*;
class Main{
    static Set<Integer> seen=new HashSet<>();
    static void dfs(int cur,int a,int b){
        if(cur<1 || seen.contains(cur)) return;
        seen.add(cur);
        dfs(cur-a,a,b);
        dfs(cur-b,a,b);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        dfs(n,a,b);
        System.out.println(seen.size());
    }
}
