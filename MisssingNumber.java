class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=(n*(n+1)/2);
       int sum2=0;
         for(int i=0;i<n;i++){
            sum2=sum2+nums[i];
         }
    int result=sum-sum2;
     return result;
        
    }
}