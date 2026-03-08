// Last updated: 3/8/2026, 3:49:53 PM
/*
 * Inspired from Java's 0ms solution.
 * Clean but same approach.
 * Refer to Java notes.
*/

1class Solution {
2public:
3    int finalValueAfterOperations(vector<string>& operations) {
4        int result = 0;
5        for(string st : operations){
6            result+= st[1] == '+' ? 1 : -1;
7        }
8        return result;
9    }
10};