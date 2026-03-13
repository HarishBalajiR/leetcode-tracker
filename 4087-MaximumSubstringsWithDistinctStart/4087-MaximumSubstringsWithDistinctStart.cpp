// Last updated: 3/13/2026, 8:15:54 PM
class Solution {
public:
    int maxDistinct(string s) {
        set<char> hashset;
        for(char ch : s) hashset.insert(ch);
        return hashset.size();
    }
};