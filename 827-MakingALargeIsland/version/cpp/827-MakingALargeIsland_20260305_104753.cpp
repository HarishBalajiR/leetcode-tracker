// Last updated: 3/5/2026, 10:47:53 AM
/*
 * DFS + Graph Theory.
 * im not understanding  it fully. will update later.
*/

1class Solution {
2    int diff[5] = {0,1,0,-1,0};
3private:
4    void dfs(int r, int c, int R, int C, vector<vector<int>>&grid, vector<vector<int>>&isl, int ictr)
5    {
6        isl[r][c] = ictr; // Visited
7        for(int di = 0 ; di < 4 ; di++){
8            int adjR = r + diff[di], adjC = c + diff[di+1];
9            if(adjR>=0 && adjC>=0 && adjR<R && adjC<C && grid[adjR][adjC] == 1 && isl[adjR][adjC]==0){
10                dfs(adjR,adjC,R,C,grid,isl,ictr);
11            }
12        }
13    }
14public:
15    int largestIsland(vector<vector<int>>& grid) {
16        int R = grid.size(), C = grid[0].size();
17        vector<vector<int>> isl(R, vector<int>(C,0));
18        int ictr = 0;  // Number of islands
19        for(int r = 0 ; r < R ; r++){
20            for(int c = 0 ; c < C ; c++){
21                if(grid[r][c]==1 && isl[r][c]==0){ // Must be an island and not be visited
22                    dfs(r,c,R,C,grid,isl,++ictr);
23                }
24            }
25        }
26        unordered_map<int,int> imap;
27        for(int r = 0 ; r < R ; r++){
28            for(int c = 0 ; c < C ; c++){
29                if(isl[r][c]!=0) imap[isl[r][c]]++;
30            }
31        }
32        int ans = 0; //Max Island size .... Entire grid might be 0;
33        for(int ctr = 1 ; ctr<=ictr ; ctr++){
34            ans = max(ans,imap[ctr]);
35        }
36        // Now toggling
37
38        for(int r = 0 ; r < R ; r++){
39            for(int c = 0 ; c < C ; c++){
40                if(grid[r][c]==0){
41                    set<int> hashset;
42                    for(int di = 0 ; di < 4 ; di++){
43                        int adjR = r + diff[di];
44                        int adjC = c + diff[di+1];
45                        if(adjR>=0 && adjC>=0 && adjR<R && adjC<C && grid[adjR][adjC]==1){
46                            hashset.insert(isl[adjR][adjC]);
47                        }
48                    }
49                
50                    int mergecount = 1;
51                    for(int island : hashset) mergecount+=imap[island];
52                    ans = max(ans,mergecount);
53                }
54            }
55        }
56       
57        return ans;
58    }
59};