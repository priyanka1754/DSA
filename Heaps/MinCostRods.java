Minimum Cost to Connect Rods:

You are given the lengths of N rods. You want to connect all the rods to form a single rod. The cost of connecting 2 rods of lengths: L1 and L2 is L1+L2. The resultant rod will also be of size L1+L2. Your task is to find the minimum cost to connect all the rods.

https://hive.smartinterviews.in/contests/smart-interviews-primary/problems/minimum-cost-to-connect-rods

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        StringBuilder sb=new StringBuilder();
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            String parts[]=br.readLine().split(" ");
            PriorityQueue<Integer> minheap=new PriorityQueue<>();
            for(int i=0;i<n;i++){
                minheap.offer(Integer.parseInt(parts[i]));
            }
            int totalCost=0;
            while(minheap.size()>1){
                int first=minheap.poll();
                int second=minheap.poll();
                int sum=first+second;
                minheap.offer(sum);
                totalCost+=sum;
            }
            sb.append(totalCost+"\n");
        }
        System.out.println(sb);
    }
}
