// Last updated: 2/22/2026, 1:54:51 PM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0 , max = 0,track = 0;
        int n = nums.length;
        for(int i = 0 ; i < n ; i++)
        {
            if(nums[i]==1) count++;
            else
            {
                if(count>max) max = count;
                count = 0;
            }
        }
        if(count>max) max = count;
        return max;
    }
}