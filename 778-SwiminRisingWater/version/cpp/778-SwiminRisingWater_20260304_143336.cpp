// Last updated: 3/4/2026, 2:33:36 PM
// Boolean Array reinitilaization
1class Solution {
2public:
3    int swimInWater(vector<vector<int>>& grid) {
4        int R = grid.size(), C = grid[0].size();
5        int timereq = 0;
6        priority_queue<tuple<int,int,int>, vector<tuple<int,int,int>>, greater<tuple<int,int,int>>> minheap;
7        bool visited[50][50] = {};
8        int diff[5] = {0,1,0,-1,0};
9        minheap.push(make_tuple(grid[0][0],0,0));
10        visited[0][0] = true;
11        int maxheight = grid[0][0];
12
13        while(!minheap.empty()){
14            tuple<int,int,int> cell= minheap.top();
15            minheap.pop();
16            maxheight = max(maxheight,get<0>(cell));
17            int r = get<1>(cell), c = get<2>(cell);
18            for(int di = 0 ; di < 4 ; di++){
19                int adjR = r + diff[di];
20                int adjC = c + diff[di+1];
21                if(adjR >= 0 && adjC >= 0 && adjR < R && adjC < C){
22                    if(adjR == R-1 && adjC == C-1) return max(maxheight,grid[adjR][adjC]);
23                    if(!visited[adjR][adjC]){
24                        minheap.push(make_tuple(grid[adjR][adjC],adjR,adjC));
25                        visited[adjR][adjC] = true;
26                    }
27                }
28            }
29        }
30        return maxheight;
31    }
32};