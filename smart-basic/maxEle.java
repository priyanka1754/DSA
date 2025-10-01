// https://hive.smartinterviews.in/contests/smart-interviews-basic/problems/max-element-in-array


// Max Element in Array

// 1.using in-build fn Arrays.sort and then getting max ele
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
        Arrays.sort(a);
        System.out.println(a[n-1]);
    }
}


// 2.iterative method comparing and then replacing max with highest ele..
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(a[i]>max){
                max=a[i];
            }
        }
        // Arrays.sort(a);
        System.out.println(max);
    }
}




// 3.recursive code..
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
        int max=a[0];
        int maxEle=findMax(a,n,0,max);
        System.out.println(maxEle);
    }
    public static int findMax(int a[],int n,int i,int max){
        if(i==n) return max;
        max=Math.max(a[i],findMax(a,n,i+1,max));
        return max;
    }
}
// but here are some problems..

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
        int maxEle=findMax(a,n,0);
        System.out.println(maxEle);
    }
    public static int findMax(int a[],int n,int i){
        if(i==n-1) return a[i];
        return Math.max(a[i],findMax(a,n,i+1));
    }
}
// this is working code..
// findMax(a,4,0)
//  └─ needs max( a[0]=3 , findMax(a,4,1) )
//                 |
//                 v
//          findMax(a,4,1)
//           └─ needs max( a[1]=7 , findMax(a,4,2) )
//                           |
//                           v
//                    findMax(a,4,2)
//                     └─ needs max( a[2]=1 , findMax(a,4,3) )
//                                     |
//                                     v
//                              findMax(a,4,3)
//                               └─ base case → return a[3] = 9


// Now unwinding (return values flowing up):

// findMax(a,4,3) → returns 9

// findMax(a,4,2) → Math.max(1, 9) → returns 9

// findMax(a,4,1) → Math.max(7, 9) → returns 9

// findMax(a,4,0) → Math.max(3, 9) → returns 9

// ✅ Final Answer = 9
