// Last updated: 3/1/2026, 6:05:02 PM
/*
 * Dynamic Programming.
 * Tracking the count of the longest increasing subsequence by iterating from last and checking for validation.
 * Storing the count of the longest subsequence at the index in the dp array.
 * return the max of the dp which is the answer
*/

1class Solution {
2    public int lengthOfLIS(int[] nums) {
3        int[] dp = new int[nums.length];
4        Arrays.fill(dp,1);
5        for(int i = nums.length - 1 ; i>=0 ; i--){
6            for(int j = i + 1 ; j < nums.length ; j++){
7                if(nums[i] < nums[j]) dp[i] = Math.max(dp[i],1+dp[j]);
8            }
9        }
10        int max = -1;
11        for(int i = 0 ; i < dp.length ; i++){
12            if(dp[i] > max) max = dp[i];
13        }
14        return max;
15        
16    }
17}