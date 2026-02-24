// Last updated: 2/24/2026, 11:51:17 AM
/*
 * HashMap Basics.
 * Use a single HashMap to track count of characters in both strings.
 * If both strings have the same characters, then ALL the values in map will be 0.
 * If not then true
*/

1class Solution {
2    public boolean isAnagram(String s, String t) {
3        HashMap<Character,Integer> map = new HashMap<>();
4        for(char ch: s.toCharArray()) map.put(ch,map.getOrDefault(ch,0)+1);
5        for(char ch: t.toCharArray()) map.put(ch,map.getOrDefault(ch,0)-1);
6        for(int value : map.values()){
7            if(value!=0) return false;
8        }
9        return true;
10    }
11}