// Last updated: 3/8/2026, 3:26:00 PM
/*
 * Same approach as C++.
 * Refer C++ Notes.
*/

1class Solution {
2    public int maxDistinct(String s) {
3        Set<Character> set = new HashSet<>();
4        for(char ch : s.toCharArray()) set.add(ch);
5        return set.size();
6    }
7}