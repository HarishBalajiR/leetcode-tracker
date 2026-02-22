// Last updated: 2/22/2026, 1:54:30 PM
class Solution {
public:
    int scoreOfString(string s) {
        int score = 0;
        for(int i = 1 ; i < s.length() ; i++) score+=abs(s[i] - s[i-1]);
        return score;
    }
};