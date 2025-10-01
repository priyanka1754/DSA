import java.io.*;
import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String[] split=s.split("\\.+");
        HashSet<String> hs=new HashSet<>();
        for(int i=0;i<split.length;i++){
            // System.out.println(split[i]);
            hs.add(split[i]);
        }
        System.out.println(hs.size());
    }
}
