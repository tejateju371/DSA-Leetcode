class Solution {
    public int[] sortedSquares(int[] nums) {
        int ptr=nums.length-1;
        int ans[]=new int[nums.length];
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int ss=nums[start]*nums[start];
             int es=nums[end]*nums[end];
             if(ss>es){
                ans[ptr]=ss;
                start++;
             }else{
                ans[ptr]=es;
                end--;
             }
             ptr--;

        }

         return ans;
    }
}