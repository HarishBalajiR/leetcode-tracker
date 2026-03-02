// Last updated: 3/2/2026, 9:54:53 PM
/*
 * Same approach as Java
 * Learned new commands like .insert(), .substr(), round()
*/

1class Solution {
2public:
3    bool hasAllCodes(string s, int k) {
4        set<string> set;
5        for(int left = 0 ; left+k <= s.size() ; left++){
6            set.insert(s.substr(left,k));
7        }
8        if(set.size()==round(pow(2,k))) return true;
9        return false;
10    }
11};