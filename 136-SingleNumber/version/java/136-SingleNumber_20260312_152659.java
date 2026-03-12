// Last updated: 3/12/2026, 3:26:59 PM
// XOR -> Removes duplicates.
1class Solution {
2    public int singleNumber(int[] nums) {
3        int result = 0;
4        for(int num : nums) result^=num;
5        return result;
6    }
7}