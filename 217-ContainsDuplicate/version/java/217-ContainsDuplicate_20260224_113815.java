// Last updated: 2/24/2026, 11:38:15 AM
/*
 * HashMap Basics.
 * If any element occurs >= 2 return true
 * else return false
*/

1class Solution {
2    public boolean containsDuplicate(int[] nums) {
3        HashMap<Integer,Integer> map = new HashMap<>();
4        for(int num: nums) map.put(num,map.getOrDefault(num,0)+1);
5        for(int key: map.keySet()){
6            if(map.get(key)>=2){
7                return true;
8            }
9        }
10        return false;
11    }
12}