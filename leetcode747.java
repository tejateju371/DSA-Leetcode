class Solution {
    public int dominantIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
            if(nums[i]>=2*nums[j]){
                return 1;

            }
            }
        }
        return -1;
        
    }
}