// Last updated: 3/2/2026, 2:08:22 PM
/*
 * Same approach as the Java code.
 * Please refer to it. Thank you.
*/

1class Solution {
2public:
3    bool isValidSudoku(vector<vector<char>>& board) {
4        bool cf[9][10], rf[9][10], sf[9][10];
5        for(int r = 0 ; r < 9 ; r++){
6            for(int c = 0 ; c < 9 ; c++){
7                if(board[r][c]=='.') continue;
8                int digit = board[r][c] - '0';
9                int sbindex = (r/3)*3 + c/3;
10                if(rf[r][digit] || cf[c][digit] || sf[sbindex][digit]) return false;
11                rf[r][digit] = cf[c][digit] = sf[sbindex][digit] = true;
12            }
13        }
14        return true;
15    }
16};