// Expand String Based on First Occurrence Index
//   You are given a string S consisting of lowercase English letters.
// Your task is to generate a new expanded string where each character in S repeats equal to its first occurrence index (1-based).

// The characters in the result should be separated by hyphens (-).
// Input
// abcaba

// Output
// a-bb-ccc-a-bb-a

// Notes
// Assume 1-based indexing.
// Watch out for trailing -. It should not appear at the end.

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) {
        // System.out.println("Try programiz.pro");
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=s.length();
        HashMap<Character,Integer> hm=new HashMap<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            hm.putIfAbsent(c,(i+1));
        }
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            int index=hm.get(c);
            for(int j=0;j<index;j++){
                sb.append(c);
            }
            if (i < n - 1) sb.append("-");
        }
        System.out.println(sb);
    }
}
