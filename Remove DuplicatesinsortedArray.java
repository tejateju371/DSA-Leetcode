class Solution {
    public int removeDuplicates(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int ptr=1;
        for(int i=1;i<nums.length;i++){
             

            if (nums[i]!=nums[i-1]){
                nums[ptr]=nums[i];
                ptr++;

              
            }

        }
        return ptr;
