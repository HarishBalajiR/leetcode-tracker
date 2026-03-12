// Last updated: 3/12/2026, 5:14:30 PM
// Same approach as Java
1class Solution {
2public:
3    char findTheDifference(string s, string t) {
4        char result = '\0';
5        for(char ch : s) result^=ch;
6        for(char ch : t) result^=ch;
7        return result;
8    }
9};