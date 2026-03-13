// Last updated: 3/13/2026, 8:16:28 PM
class Solution {
public:
    bool checkOnesSegment(string s) {
        for(int index = 1 ; index < s.size() ; index++){
            if(s[index] == '1' && s[index-1] == '0') return false;
        }
        return true;
    }
};