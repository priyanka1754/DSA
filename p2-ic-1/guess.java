Guess the Problem - 1 Understand the problem statement from the given sample input and output.

Input Format
The first line of input contains T - the number of test cases. It's followed by T lines, each line contains 2 strings A and B, separated by space, consisting only of lowercase English alphabets.

Output Format
For each test case, print the desired output, separated by a new line.

Constraints
10 points
1 <= T <= 100
1 <= len(A), len(B) <= 100

40 points
1 <= T <= 1000
1 <= len(A) <= 5000
1 <= len(A), len(B) <= 5000

Example
Input
2
data structures
smart interviews

Output
srucures
ineview



import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            String str=sc.next();
            Set<Character> hs=new HashSet<>();
            for(char ch:s.toCharArray()){
                hs.add(ch);
            }
            StringBuilder sb=new StringBuilder();
            for(char ch:str.toCharArray()){
                if(!hs.contains(ch)){
                    sb.append(ch);
                }
            }
            System.out.println(sb);
        }
    }
}