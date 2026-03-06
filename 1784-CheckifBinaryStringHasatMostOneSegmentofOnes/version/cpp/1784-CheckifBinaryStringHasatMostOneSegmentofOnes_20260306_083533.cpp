// Last updated: 3/6/2026, 8:35:33 AM
/*
 * Same approach as Java.
 * Refer Java notes.
*/

1class Solution {
2public:
3    bool checkOnesSegment(string s) {
4        for(int index = 1 ; index < s.size() ; index++){
5            if(s[index] == '1' && s[index-1] == '0') return false;
6        }
7        return true;
8    }
9};