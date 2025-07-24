https://www.geeksforgeeks.org/problems/geek-onacci-number/0

Geek-onacci Number

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int c=sc.nextInt();
		    int n=sc.nextInt();
		    int nthfib=fib(a,b,c,n);
		    System.out.println(nthfib);
		}
	}
	
	public static int fib(int a,int b,int c,int n){
	    if(n==1) return a;
	    if(n==2) return b;
	    if(n==3) return c;
	    return fib(a,b,c,n-1)+fib(a,b,c,n-2)+fib(a,b,c,n-3);
	}
}