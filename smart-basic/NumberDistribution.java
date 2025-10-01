// https://hive.smartinterviews.in/contests/smart-interviews-basic/problems/number-distribution

// Number Distribution 
  
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int pos=0,neg=0,zer=0;
        for(int i=0;i<n;i++){
            if(a[i]==0){
                zer++;
            }else if(a[i]<0){
                neg++;
            }else{
                pos++;
            }
        }
        System.out.println(zer+" "+pos+" "+neg);
    }
}


//alternate method using hash map.("zero" - count)
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, Integer> freq = new HashMap<>();
        freq.put("zero", 0);
        freq.put("positive", 0);
        freq.put("negative", 0);

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x == 0) freq.put("zero", freq.get("zero") + 1);
            else if (x > 0) freq.put("positive", freq.get("positive") + 1);
            else freq.put("negative", freq.get("negative") + 1);
        }

        System.out.println(freq.get("zero") + " " + freq.get("positive") + " " + freq.get("negative"));
    }
}
