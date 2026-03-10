// Last updated: 3/10/2026, 8:34:02 PM
/*
 * Okay. Substring() reversal problem.
 * Get substring using .substr() and reverse it add it to remaining string.
*/

1class Solution {
2public:
3    string reversePrefix(string s, int k) {
4        string substring = s.substr(0,k);
5        reverse(substring.begin(),substring.end());
6        return substring + s.substr(k,s.size());
7    }
8};