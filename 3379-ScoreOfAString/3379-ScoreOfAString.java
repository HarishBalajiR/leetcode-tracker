// Last updated: 2/22/2026, 1:54:26 PM
class Solution {
    public int scoreOfString(String s) {
        int score = 0;
        for(int i = 1 ; i < s.length() ; i++)
        {
            score+=Math.abs(s.charAt(i) - s.charAt(i-1));
        }
        return score;
    }
}