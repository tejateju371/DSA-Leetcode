class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        if(nums.length==1){
            return nums;
        }
        
       
        int ptr=0;
        int ans[]=new int[nums.length];
        for(int i=1;i<=nums.length-1;i++){
            if (nums[i]==nums[i-1]){
                ans[ptr]=nums[i];
                ptr++;

            }
        }
        int  ans2[]=new int[3];
                  int  ans3[]=new int[2];

        for(int i=0;i<ans.length-3;i++){
            if(ans[i]==ans[i+1])
                continue;
            
            ans2[i]=ans[i];
                ans3[0]=ans2[1];
                ans3[1]=ans2[2];


        }
        return ans3;
    }
}