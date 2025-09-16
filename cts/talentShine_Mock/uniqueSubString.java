Unique Substrings of Length K.
You are the organizer of a local book club, 
and you want to prepare for the next meeting by creating trivia questions based on unique chapter titles 
from the books your members have read. To do this, you need to analyze a chapter title and count the unique substrings.
Your task is to find and return an integer value representing the count of the unique substrings of a specific length K.
Input Specification:
input1: A string S representing the chapter title.
input2: An integer value K representing the length of the substrings.
Output Specification:
Return an integer value representing the count of the unique substrings of a specific length K.
Example 1:
input1: abcabc
input2: 3
Output: 3
Explanation:
Here, the chapter title is "abcabc" and K = 3. 
The unique substrings of length 3 that can be formed are:"abc""bca""cab"
Since there are 3 unique substrings, 3 is returned as the output.

import java.io.*;
import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=s.length();
        int k=sc.nextInt();
        HashSet<String> hs=new HashSet<>();
        for(int i=0;i<=n-k;i++){
            hs.add(s.substring(i,i+k));
        }
        System.out.println(hs.size());
    }
}
