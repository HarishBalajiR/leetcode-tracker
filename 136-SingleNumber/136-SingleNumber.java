// Last updated: 3/16/2026, 8:23:15 AM
class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int num : nums) result^=num;
        return result;
    }
}