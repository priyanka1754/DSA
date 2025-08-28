// Anytime Median 
// Given an integer array, print the median for the sub-array 0 to i, for every i, 0 <= i <= N-1.


import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            PriorityQueue<Integer> minheap=new PriorityQueue<>();
            PriorityQueue<Integer> maxheap=new PriorityQueue<>(Collections.reverseOrder());
            
            for(int i=0;i<n;i++){
            int x=a[i];
            if(maxheap.size()==0 || x<=maxheap.peek()){
                maxheap.offer(x);
            }else{
                minheap.offer(x);
            }
            if(minheap.size()-maxheap.size()>1){
                maxheap.offer(minheap.poll());
            }
            if(maxheap.size()-minheap.size()>1){
                minheap.offer(maxheap.poll());
            }
            if(maxheap.size()>=minheap.size()){
                System.out.print(maxheap.peek()+" ");
            }else{
                System.out.print(minheap.peek()+" ");
            }
            }
            System.out.println();
        }
    }
}
