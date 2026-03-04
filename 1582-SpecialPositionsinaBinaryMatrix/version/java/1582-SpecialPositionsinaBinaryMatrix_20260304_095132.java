// Last updated: 3/4/2026, 9:51:32 AM
/*
 * Basic Matrix Checking.
 * If 1 occurs in a matrix -> its rows should not have 1
 * using flag we can do it.
*/

1class Solution {
2    public int numSpecial(int[][] mat) {
3        int specialcount = 0;
4        int R = mat.length, C = mat[0].length;
5        for(int r = 0 ; r < R ; r++){
6            for(int c = 0 ; c < C ; c++){
7                if(mat[r][c]==1){
8                    int resultrow = r, resultcol = c;
9                    boolean flag = true;
10                    for(int row = 0 ; row < R ; row++){ 
11                        if(row != r && mat[row][c]==1){
12                            flag = false;
13                            break;
14                        }
15                    }
16                    for(int col = 0 ; col < C ; col++){ 
17                        if(col!=c && mat[r][col]==1){
18                            flag = false;
19                            break;
20                        }
21                    }
22                    if(flag) specialcount++;
23                }
24            }
25        }
26        return specialcount;
27    }
28}