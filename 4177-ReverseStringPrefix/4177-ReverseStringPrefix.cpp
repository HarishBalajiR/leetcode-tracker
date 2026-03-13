// Last updated: 3/13/2026, 8:15:51 PM
class Solution {
public:
    string reversePrefix(string s, int k) {
        string substring = s.substr(0,k);
        reverse(substring.begin(),substring.end());
        return substring + s.substr(k,s.size());
    }
};