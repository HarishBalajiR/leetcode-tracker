// Last updated: 3/15/2026, 7:29:49 PM
/*
 * Basic PROBLEM of weekly contest.
 * easy
*/

1class Solution {
2    public int firstUniqueEven(int[] nums) {
3        HashMap<Integer,Integer> map = new LinkedHashMap<>();
4        for(int num : nums) map.put(num,map.getOrDefault(num,0)+1);
5        for(int key : map.keySet()){
6            if(key%2==0 && map.get(key)==1) return key;
7        }
8        return -1;
9    }
10}