// Last updated: 2/22/2026, 1:54:21 PM
class Solution {
    public int minOperations(int[] nums, int k) {
        int sum = 0;
        for(int num:nums) sum+=num;
        return sum%k;
    }
}