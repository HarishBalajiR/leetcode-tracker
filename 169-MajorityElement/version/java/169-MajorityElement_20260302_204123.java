// Last updated: 3/2/2026, 8:41:23 PM
/*
 * HashMap Basics.
 * Count all elements.
 * Return if count > n/2
*/

1class Solution {
2    public int majorityElement(int[] nums) {
3        HashMap<Integer,Integer> map = new HashMap<>();
4        int n = nums.length;
5        int ans = 0;
6        for(int num : nums) map.put(num,map.getOrDefault(num,0)+1);
7        for(int key : map.keySet()){
8            if(map.get(key) > n/2){
9                ans = key;
10            }
11        }
12        return ans;
13    }
14}