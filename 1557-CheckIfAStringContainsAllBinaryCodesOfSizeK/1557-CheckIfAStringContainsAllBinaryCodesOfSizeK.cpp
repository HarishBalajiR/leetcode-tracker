// Last updated: 3/13/2026, 8:16:51 PM
class Solution {
public:
    bool hasAllCodes(string s, int k) {
        set<string> set;
        for(int left = 0 ; left+k <= s.size() ; left++){
            set.insert(s.substr(left,k));
        }
        if(set.size()==round(pow(2,k))) return true;
        return false;
    }
};