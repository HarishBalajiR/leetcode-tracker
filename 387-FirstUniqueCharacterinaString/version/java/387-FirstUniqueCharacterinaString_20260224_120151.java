// Last updated: 2/24/2026, 12:01:51 PM
/*
 * LinkedHashMap Basics
 * Because we need to find FIRST non repeating character.
 * To find the index -> s.indexOf(key)
*/

1class Solution {
2    public int firstUniqChar(String s) {
3        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
4        for(char ch : s.toCharArray()) map.put(ch,map.getOrDefault(ch,0)+1);
5        for(Character key : map.keySet()){
6            if(map.get(key)==1) return s.indexOf(key); 
7        }
8        return -1;
9    }
10}