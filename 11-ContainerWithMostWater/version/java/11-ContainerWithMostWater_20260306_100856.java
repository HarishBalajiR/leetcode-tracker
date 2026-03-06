// Last updated: 3/6/2026, 10:08:56 AM
/*
 * Learnt Two Pointers.
 * Approach:
 * Keep track of the water present in both the heights  while incrementing the pointer which is minimum.
 * Updating maxwater
 * If left height is minimum -> left++
 * else right--
*/

1class Solution {
2    public int maxArea(int[] height) {
3        int n = height.length;
4        int left = 0 , right = n - 1;
5        int maxwater = 0;
6        while(left < right){
7            int currwater = Math.min(height[left],height[right]) * (right - left);
8            maxwater = Math.max(maxwater,currwater);
9            if(height[left] < height[right]) left++;
10            else right--;
11        }
12        return maxwater;
13    }
14}