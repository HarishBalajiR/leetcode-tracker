// Last updated: 3/4/2026, 4:41:49 PM
/*
 * Simple logical thinking problem.
 * Sort first -> Smallest at the start, largest at the end
 * 1st condition -> No -ve numbers -> return nums[n-1]*nums[n-2]*nums[n-3]
 * 2nd condition -> WIth -ve numbers:
 * The largest negative number will be at the start and two negative  numbers multiplied gives +ve numbers and multiply that with largest element (nums[n-1])
*/

1class Solution {
2    public int maximumProduct(int[] nums) {
3        Arrays.sort(nums);
4        int n = nums.length;
5        return Math.max(nums[n-1] * nums[n-2] * nums[n-3],nums[0] * nums[1] * nums[n-1]);
6    }
7}