// Last updated: 2/24/2026, 11:39:53 AM
/*
 * Same approach as the first one.
 * Optimized to a single for loop.
*/

1class Solution {
2    public boolean containsDuplicate(int[] nums) {
3        HashMap<Integer,Integer> map = new HashMap<>();
4        for(int num: nums){
5            map.put(num,map.getOrDefault(num,0)+1);
6            if(map.get(num)>=2){
7                return true;
8            }
9        }
10        return false;
11    }
12}