import java.io.*;
import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=s.length();
        int k=sc.nextInt();
        HashSet<String> hs=new HashSet<>();
        for(int i=0;i<n-k+1;i++){
            hs.add(s.substring(i,i+k));
        }
        // System.out.println(hs);
        System.out.println(hs.size());
    }
}
