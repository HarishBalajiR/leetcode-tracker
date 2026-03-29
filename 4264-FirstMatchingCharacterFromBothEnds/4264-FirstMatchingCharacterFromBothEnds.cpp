// Last updated: 3/29/2026, 11:14:46 AM
class Solution {
public:
    int firstMatchingIndex(string s) {
        for(int index = 0 ; index < s.size() ; index++){
            if(s[index]==s[s.size()-index-1]) return index;
        }
        return -1;
    }
};