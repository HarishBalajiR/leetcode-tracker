// Last updated: 3/13/2026, 8:18:56 PM
/*
 * Two Pointer Basics.
 * Swap characters from both ends to reverse.
*/

1class Solution {
2public:
3    void reverseString(vector<char>& s) {
4        int left = 0, right = s.size() - 1;
5        while(left<right){
6            char temp = s[left];
7            s[left] = s[right];
8            s[right] = temp;
9            left++;
10            right--;
11        }
12    }
13};