Window Maximum 
Given an array of integers of size N and a window size K. 
For each continuous window of size K, find the highest element in the window.
Output the sum of the highest element of all the windows.

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
            Deque<Integer> dq=new Deque<>();
            int sum=0;
            for(int i=0;i<n-k+1;i++){
                int j=i+k;
                int maxEle=a[i];
                for(int p=i;p<j;p++){
                    maxEle=Math.max(maxEle,a[p]);
                    // System.out.print(maxEle+" ");
                }
                sum+=maxEle;
            }
            System.out.println(sum);
        }
    }
}
