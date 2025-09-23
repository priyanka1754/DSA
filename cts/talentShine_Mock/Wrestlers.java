import java.io.*;
import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int w[]=new int[n];
        for(int i=0;i<n;i++){
            w[i]=sc.nextInt();
        }
        int flag=0;
        int ans=0;
        int k=sc.nextInt();
        for(int i=0;i<n-k;i++){
            flag=0;
            for(int j=i;j<k;j++){
                if(w[i]!=w[j]){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                ans=w[i]*k;
                System.out.println(ans);
                break;
            }
        }
         if(flag==1)System.out.println(-1);
    }
}
