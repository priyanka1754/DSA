Recursive Programs to find Minimum and Maximum elements of array

Given an array of integers arr[], the task is to find the minimum and maximum elements in the array using recursion only.




// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int a[]={1,5,3,-5,-4,10,-11};
        int i=1;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        fun(a,i,min,max);
    }
    public static void fun(int a[],int i,int min,int max){
        if(i==a.length){
            
        System.out.println(min+" "+max);
        return;
        }
        
        min=Math.min(min,a[i]);
        max=Math.max(max,a[i]);
        fun(a,i+1,min,max);
    }
}