// Last updated: 3/11/2026, 4:27:35 PM
/*
 * Same approach as C++.
 * plz refer c++ notes.
*/

1class Solution {
2    public int searchInsert(int[] nums, int target) {
3        int n = nums.length;
4        int start = 0, end = n - 1;
5        while(start <= end){
6            int mid = start + (end - start)/2;
7            if(nums[mid] == target) return mid;
8            else if(nums[mid] < target) start = mid + 1;
9            else end = mid - 1;
10        }
11        return start;
12    }
13}