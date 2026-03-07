// Last updated: 3/7/2026, 2:53:38 PM
/*
 * Simple Logical Problem.
 * They are asking smallest missing multiple.
 * Iterate through the multiples of k upto k*nums.length so we can cover everything (this is impossible but it is possible due to constraints)
 * and check if the mulitple of k exists -> if it does not then return it.
*/

1class Solution {
2    public int missingMultiple(int[] nums, int k) {
3        ArrayList<Integer> arr = new ArrayList<>();
4        for(int num : nums) arr.add(num);
5        for(int value = k ; value <= value*nums.length ; value+=k){
6            if(!arr.contains(value)) return value;
7        }
8        return 0;
9    }
10}