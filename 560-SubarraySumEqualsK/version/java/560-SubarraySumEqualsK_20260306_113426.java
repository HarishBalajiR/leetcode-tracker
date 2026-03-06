// Last updated: 3/6/2026, 11:34:26 AM
/*
 * Interesting Problem using HashMap.
 * Subarray also contains negative values so we cannot use two pointers.
 * 
 * Approach:
 * map -> To track if currsum - k exists and for counting subarrays with sum == k
 * 
 * if complement(currsum - k) exists -> subcount+=map.get(complement)
 * 
 * now if currsum == k -> add 1 to currsum ( For this idc if complement exists or not)
*/

1class Solution {
2    public int subarraySum(int[] nums, int k) {
3        int n = nums.length;
4        int subcount = 0,currsum = 0;
5        HashMap<Integer,Integer> map = new HashMap<>();
6        map.put(0,1);
7        for(int left = 0 ; left < n ; left++){
8            currsum += nums[left];
9            if(map.containsKey(currsum-k)) subcount+=map.get(currsum-k);
10            map.put(currsum,map.getOrDefault(currsum,0)+1);
11        }
12        return subcount;
13    }
14}