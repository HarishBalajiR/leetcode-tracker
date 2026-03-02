// Last updated: 3/2/2026, 1:59:27 PM
class Solution {
    int[] rowdiff = {1,0,-1,0};
    int[] coldiff = {0,1,0,-1};
    public int longestIncreasingPath(int[][] matrix) {
        int R = matrix.length, C = matrix[0].length;
        int[][] path = new int[R][C];
        int ans = 1; // To store max path length
        for(int r = 0 ; r < R ; r++){
            for(int c = 0 ; c < C ; c++){
                if(path[r][c]==0){ //We have not visited this
                    path[r][c] = dfs(r,c,R,C,matrix,path);
                    ans = Math.max(ans,path[r][c]); // Finding the maximum
                }
            }
        }
        return ans;
    }
    private int dfs(int r, int c, int R, int C, int[][] matrix, int[][]path){
        if(path[r][c]!=0) return path[r][c];
        int maxpath = 1;
        for(int di = 0 ; di < 4 ; di++){
            int adjR = r + rowdiff[di];
            int adjC = c + coldiff[di];
            if(adjR < 0 || adjC < 0 || adjR > R-1 || adjC > C-1) continue;
            if(matrix[adjR][adjC] > matrix[r][c]){ // Check if prev > curr (Increasing)
                int currpath = dfs(adjR,adjC,R,C,matrix,path);
                path[adjR][adjC] = currpath;
                maxpath = Math.max(maxpath,currpath+1); // +1 is to add the current elem
            } 
        }
        return maxpath;
    }
}