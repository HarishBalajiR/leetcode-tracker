// Last updated: 3/13/2026, 8:15:48 PM
class Solution {
    public String reversePrefix(String s, int k) {
        String substring = s.substring(0,k);
        StringBuilder sb = new StringBuilder(substring);
        return sb.reverse().toString() + s.substring(k,s.length());
    }
}