Given a string find its first uppercase letter
Examples : 

Input : geeksforgeeKs
Output : K

Input  : geekS
Output : S

First uppercase letter in a string (Iterative and Recursive)


// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        String s="geeksForgeeKs";
        char ch=fun(s,0,s.length());
        System.out.println(ch);
    }
    
    public static char fun(String s,int i,int n){
        if(i==n){
            return 0;
        }
        if(Character.isUpperCase(s.charAt(i))){
            return s.charAt(i);
        }
        return fun(s,i+1,n);
    }
}