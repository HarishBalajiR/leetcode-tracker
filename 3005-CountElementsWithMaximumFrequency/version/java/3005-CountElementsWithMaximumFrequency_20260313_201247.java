// Last updated: 3/13/2026, 8:12:47 PM
/*
 * HashMap Basics.
 * Count all integers.
 * Find which one has maxfreq
 * add the COUNT of element which has maxfreq
 * return maxfreq.
*/

1class Solution {
2    public int maxFrequencyElements(int[] nums) {
3        HashMap<Integer,Integer> map = new HashMap<>();
4        for(int num : nums) map.put(num,map.getOrDefault(num,0)+1);
5        int maxfreq = 0;
6        for(int value : map.values()) maxfreq = Math.max(maxfreq,value);
7        int result = 0;
8        for(int key : map.keySet()){
9            if(map.get(key) == maxfreq) result+=map.get(key);
10        }
11        return result;
12    }
13}