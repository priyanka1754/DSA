https://www.geeksforgeeks.org/problems/print-1-to-n-without-using-loops-1587115620/1

Print 1 To N Without Loop

class Solution {
    public void printNos(int n) {
        // Code here
        if(n==0){
            return;
        }
        printNos(n-1);
        System.out.print(n+" ");
    }
}
