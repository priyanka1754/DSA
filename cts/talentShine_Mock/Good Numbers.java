Good Numbers

John is a class teacher, and he has the answer sheets of the students given in an integer array A, where every A[i] represents one answer sheet and each digit of A[i] represents one answer. 
John wants to check the students who have passed the exams using the following method:
The sum of the answers in the answer sheet is greater than the smallest digit present in the given integer M.
All the answers in the answer sheet are different from all the digits in M.
Your task is to help John find and return an integer value representing the number of students who have passed the exams.
Input Specification:
input1: An integer value N, representing the number of students.
input2: An integer value M.input3: An integer array A, containing the answer sheets of students.
Output Specification:
Return an integer value representing the number of students who have passed the exams.
Example 1:
input1: 3
input2: 7777
input3: [909,3347,1211]
Output: 1
Explanation:First Student-909: All the answers are different from all the digits of M and the sum of the answers, 18 (9+0+9) is greater than 7. So, this student has passed the exam.Second Student-3347: The fourth answer is the same as the digit 7 in integer M. So, this student has failed the exam.Third Student-1211: All the answers are different from all the digits of M but the sum of the answers, 5 (1+2+1+1), is less than 7, so the student failed the exam.Only one student passed the exam. Hence, 1 is returned as the output.


import java.io.*;
import java.util.*;
class Main{
    public static HashSet<Integer> Digits(int m){
        HashSet<Integer> hs=new HashSet<>();
        while(m>0){
            int rem=m%10;
            hs.add(rem);
            m/=10;
        }
        return hs;
    }
    public static boolean unique(int a,HashSet<Integer> hs){
        while(a>0){
            int rem=a%10;
            if(hs.contains(rem)) return false;
            a/=10;
        }
        return true;
    }
    public static boolean sumDigits(int a,int minEle){
        int sum=0;
        while(a>0){
            int rem=a%10;
            sum+=rem;
            a/=10;
        }
        if(sum>minEle) return true;
        else return false;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        
        HashSet<Integer> hs=Digits(m);
        int minEle=Collections.min(hs);
        
        int c=0;
        for(int i=0;i<n;i++){
            if(unique(a[i],hs) && sumDigits(a[i],minEle)){
                c++;
            }
        }
        System.out.println(c);
    }
}