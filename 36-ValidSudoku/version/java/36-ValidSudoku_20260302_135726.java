// Last updated: 3/2/2026, 1:57:26 PM
/*
 * Traversing the matrix and replacing the visited like DFS.
 * rf - row flag, cf - col flag, sf - submatrix flag
 * If the element is '.' -> continue
 * digit = ch -'0'
 * First Check invalid condition:
 *     If the elem exists  in current row -> rf[r][digit] 
 *     If the elem exists in current col -> cf[c][digit]
 *     If the elem exists in the submatrix (i.e) its box -> sf[sbindex][digit]
 * Will update on what is the sbindex now i have doubt
 * If we have visited the elem replace with true.
 * If at any point we get invalid condition -> false
 * else return true.
 * By - HarishBalajiR
*/

1class Solution {
2    public boolean isValidSudoku(char[][] board) {
3        boolean[][] rf = new boolean[9][10];
4        boolean[][] cf = new boolean[9][10];
5        boolean[][] sf = new boolean[9][10];
6
7        for(int r = 0 ; r < 9 ; r++){
8            for(int c = 0 ; c < 9 ; c++){
9                if(board[r][c] == '.') continue;
10                int digit = board[r][c] - '0';
11                int sbindex = (r/3)*3 + (c/3);
12                if(rf[r][digit] || cf[c][digit] || sf[sbindex][digit]) return false;
13                rf[r][digit] = cf[c][digit] = sf[sbindex][digit] = true;
14            }
15        }
16        return true;
17    }
18}