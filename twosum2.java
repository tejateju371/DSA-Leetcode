class Solution {
    public int[] twoSum(int[] numbers, int target) {
int left = 0;
    int right = numbers.length - 1;
    
    while (left < right) {
        int sum = numbers[left] + numbers[right];
        
        if (sum == target) {
            return new int[]{left+1, right+1};
        } else if (sum < target) {
            left++;
        } else {
            right--;
        }
    }
    
    // Since there is exactly one solution, this line will never be reached.
    return new int[]{-1, -1};
}

    
}
