// Last updated: 3/4/2026, 10:11:24 AM
/*
 * Same approach as Java.
 * Nothing has changed but i learnt more syntax.
*/

1class Solution {
2public:
3    int numSpecial(vector<vector<int>>& mat) {
4        int spec = 0;
5        int R = mat.size(), C = mat[0].size();
6        for(int r = 0 ; r < R ; r++){
7            for(int c = 0 ; c < C ; c++){
8                bool flag = true;
9                if(mat[r][c]==1){
10                    for(int row = 0 ; row < R ; row++){
11                        if(row!=r && mat[row][c]==1){
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
22                    if(flag) spec++;
23                }
24            }
25        }
26        return spec;
27    }
28};