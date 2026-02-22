// Last updated: 2/22/2026, 1:54:55 PM
class Solution {
    public char findTheDifference(String s, String t) {
        char result = '\0';
        for(char ch: s.toCharArray()) result^=ch;
        for(char ch:t.toCharArray()) result^=ch;
        return result;
    }
}