// Last updated: 3/4/2026, 5:45:07 AM
/*
 * HashMap Basics.
 * If key is in map and its value is <=k -> return true
 * else keep adding
 * and return false at last
*/

1class Solution {
2    public boolean containsNearbyDuplicate(int[] nums, int k) {
3        HashMap<Integer,Integer> map = new HashMap<>();
4        for(int index = 0 ; index < nums.length ; index++){
5            if(map.containsKey(nums[index]) && index - map.get(nums[index])<=k){
6                System.out.println(nums[index] + map.get(nums[index]));
7                return true;
8            }
9            map.put(nums[index],index);
10        }
11        return false;
12    }
13}