// Last updated: 3/10/2026, 9:00:15 PM
/*
 * Loop thru each character.
 * If we find our target character, we reverse the substring and add the remaining string.
 * else return word.
*/

1class Solution {
2    public String reversePrefix(String word, char ch) {
3        for (int index = 0; index < word.length(); index++) {
4            if (word.charAt(index) == ch) {
5                String substring = word.substring(0,index+1);
6                StringBuilder sb = new StringBuilder(substring);
7                return sb.reverse().toString() + word.substring(index+1,word.length());
8            }
9        }
10        return word;
11    }
12}