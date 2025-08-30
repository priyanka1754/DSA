https://hive.smartinterviews.in/contests/smart-interviews-primary/problems/implement-min-heap

Implement Min Heap

import java.io.*;
import java.util.*;
class MinHeap{
    private int[] heap;
    private int size;
    public MinHeap(int capacity){
        heap=new int[capacity+1];
        size=0;
    }
    public void insert(int val){
        heap[++size]=val;
        int index=size;
        while(index>1 && heap[index/2]>heap[index]){
            swap(index,index/2);
            index/=2;
        }
    }
    public void delMin(){
        if(size==0){
            return;
        }
        heap[1]=heap[size--];
        int index=1;
        while(2*index<=size){
            int left=2*index;
            int right=left+1;
            int smallest=left;
            if(right<=size && heap[right]<heap[left]){
                smallest=right;
            }
            if(heap[index]<=heap[smallest]) break;
            swap(index,smallest);
            index=smallest;
        }
    }
    public Integer getMin(){
        if(size==0) return null;
        return heap[1];
    }
    public void swap(int a,int b){
        int temp=heap[a];
        heap[a]=heap[b];
        heap[b]=temp;
    }
}
public class Main {
   
    public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int NoofOperations=Integer.parseInt(br.readLine());
        MinHeap heap=new MinHeap(NoofOperations);
        StringBuilder sb=new StringBuilder();
        while(NoofOperations-->0){
            String parts[]=br.readLine().split(" ");
            String operation=parts[0];
            if(operation.equals("insert")){
                int x=Integer.parseInt(parts[1]);
                heap.insert(x);
            }else if(operation.equals("getMin")){
                Integer min=heap.getMin();
                if(min==null){
                    sb.append("Empty\n");
                }else{
                    sb.append(min).append("\n");
                }
            }else if(operation.equals("delMin")){
                heap.delMin();
            }
        }
        System.out.print(sb);
    }
}
