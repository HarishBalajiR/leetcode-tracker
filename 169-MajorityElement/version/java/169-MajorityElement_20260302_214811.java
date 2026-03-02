// Last updated: 3/2/2026, 9:48:11 PM
/*
 * Very Interesting Sliding Window problem.
 * Given as Daily Task by mentor
 * 
 * Basically -> Add k length substrings to the set and check its size
 * by using 2^k
*/

1class Solution {
2    public boolean hasAllCodes(String s, int k) {
3        HashSet<String> map = new HashSet<>();
4        for(int left = 0 ; left+k <= s.length() ; left++){
5            map.add(s.substring(left,left+k));
6        }
7        if(map.size() == Math.pow(2,k)) return true;
8        return false;
9    }
10}