// Last updated: 2/22/2026, 5:50:54 PM
/*
 * HashMap Basics.
 * Count all the numbers and find which numbers are repeated twice.
 * i to track index of result.
*/

1class Solution {
2    public int[] getSneakyNumbers(int[] nums) {
3        int[] result = new int[2];
4        HashMap<Integer,Integer> map = new HashMap<>();
5        for(int num: nums) map.put(num,map.getOrDefault(num,0)+1);
6        int i = 0;
7        for(int key: map.keySet()){
8            int count = map.get(key);
9            if(count==2){
10                result[i] = key;
11                i++;
12            }
13        }
14        return result; 
15    }
16}