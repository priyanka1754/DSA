https://hive.smartinterviews.in/contests/smart-interviews-primary/problems/kth-smallest-element

Kth Smallest Element

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            PriorityQueue<Integer> maxheap=new PriorityQueue<>(Collections.reverseOrder());
            for(int i=0;i<n;i++){
                maxheap.offer(a[i]);
                if(maxheap.size()>k){
                    maxheap.poll();
                }
            }
            System.out.println(maxheap.peek());
        }
    }
}
