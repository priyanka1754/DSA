https://hive.smartinterviews.in/contests/smart-interviews-primary/problems/convert-k-value

Convert K Value

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            PriorityQueue<Integer> maxheap=new PriorityQueue<>(Collections.reverseOrder());
            int n=sc.nextInt();
            int k=sc.nextInt();
            for(int i=0;i<n;i++){
                maxheap.offer(sc.nextInt());
            }
            int c=0;
            while(k>0 && !maxheap.isEmpty()){
                int maxEle=maxheap.poll();
                k-=maxEle;
                int shrink=maxEle/2;
                if(shrink>0)maxheap.offer(shrink);
                c++;
            }
            if(k>0){
                System.out.print("-1\n");
            }else{
                System.out.print(c+"\n");
            }
        }
    }
}
