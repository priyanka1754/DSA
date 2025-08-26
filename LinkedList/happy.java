https://leetcode.com/problems/happy-number/

202. Happy Number

class Solution {

    public int findSquare(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum+=rem*rem;
            n/=10;
        }
        return sum;
    }

    public boolean isHappy(int n) {
        int slow=n;
        int fast=n;
        do{
            slow=findSquare(slow);
            fast=findSquare(findSquare(fast));
        }while(slow!=fast);

        if(slow==1) return true;
        return false;
    }
}


//another solution using hashSet....

