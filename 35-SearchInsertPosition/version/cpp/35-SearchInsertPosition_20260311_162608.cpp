// Last updated: 3/11/2026, 4:26:08 PM
/*
 * Binary Search Logic.
 * Sorted Array and log n time  ===> ALWAYS BINARY SEARCH
 * If we find the element return its index -> return mid
 * else we return the position where we would place it which is left.
 * Why?
 * After we search the array fully, and left becomes > right its the correct position to place it.
*/

1class Solution {
2public:
3    int searchInsert(vector<int>& nums, int target) {
4        int n = nums.size();
5        int left = 0, right = n  - 1;
6        while(left <= right){
7            int mid = left + (right-left)/2;
8            if(nums[mid] == target) return mid;
9            else if(nums[mid] < target) left = mid + 1;
10            else right = mid - 1;
11        }
12        return left;
13    }
14};