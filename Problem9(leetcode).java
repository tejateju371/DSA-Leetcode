class Solution {
    public boolean isPalindrome(int x) {
        int n=x;
        int result=0;
        if(n<0){
            return false;

        }
        else{
            while(n>0){
            int d=n%10;
             result = result*10+d;
            n=n/10;
        }
        }
        if(x==result){
         return true;
        }
        else{
            return false;
        }
     
    }
}