// Last updated: 3/2/2026, 12:11:19 PM
/*
 * DFS + DP approach.
 * Explained on my submissions.
*/

1class Solution {
2    int[] rowdiff = {1,0,-1,0};
3    int[] coldiff = {0,1,0,-1};
4    public int longestIncreasingPath(int[][] matrix) {
5        int R = matrix.length, C = matrix[0].length;
6        int[][] path = new int[R][C];
7        int ans = 1; // To store max path length
8        for(int r = 0 ; r < R ; r++){
9            for(int c = 0 ; c < C ; c++){
10                if(path[r][c]==0){ //We have not visited this
11                    path[r][c] = dfs(r,c,R,C,matrix,path);
12                    ans = Math.max(ans,path[r][c]); // Finding the maximum
13                }
14            }
15        }
16        return ans;
17    }
18    private int dfs(int r, int c, int R, int C, int[][] matrix, int[][]path){
19        if(path[r][c]!=0) return path[r][c];
20        int maxpath = 1;
21        for(int di = 0 ; di < 4 ; di++){
22            int adjR = r + rowdiff[di];
23            int adjC = c + coldiff[di];
24            if(adjR < 0 || adjC < 0 || adjR > R-1 || adjC > C-1) continue;
25            if(matrix[adjR][adjC] > matrix[r][c]){ // Check if prev > curr (Increasing)
26                int currpath = dfs(adjR,adjC,R,C,matrix,path);
27                path[adjR][adjC] = currpath;
28                maxpath = Math.max(maxpath,currpath+1); // +1 is to add the current elem
29            } 
30        }
31        return maxpath;
32    }
33}