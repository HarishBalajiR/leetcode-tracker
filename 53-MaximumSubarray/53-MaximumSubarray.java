// Last updated: 2/22/2026, 1:55:05 PM
class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0, max = Integer.MIN_VALUE;
        for(int num: nums)
        {
            sum+=num;
            if(sum>max) max = sum;
            if(sum<0) sum = 0;
        }
        return max;
    }
}