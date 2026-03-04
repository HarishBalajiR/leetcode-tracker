// Last updated: 3/4/2026, 5:08:59 PM
/*
 * Same approach as Java.
 * Refer Java Notes.
*/

1class Solution {
2    int diff[5] = {0,1,0,-1,0};
3private:
4    bool dfs(int r, int c, int R, int C, vector<vector<char>> &board, string word, int ni){     // ni -> next index
5        if(ni==word.size()) return true;
6        char ch = board[r][c];
7        board[r][c] = '*';              // for backtracking
8        for(int di = 0 ; di < 4 ; di++){
9            int adjR = r + diff[di];
10            int adjC = c + diff[di+1];
11            if(adjR >= 0 && adjC >= 0 && adjR < R && adjC < C && board[adjR][adjC]==word[ni]){
12                bool found = dfs(adjR, adjC, R, C, board, word, ni+1);
13                if(found) return true;
14            }
15        }
16        board[r][c] = ch;
17        return false;
18    } 
19public:
20    bool exist(vector<vector<char>>& board, string word) {
21        int R = board.size(), C = board[0].size();
22        for(int r = 0 ; r < R ; r++){
23            for(int c = 0 ; c < C ; c++){
24                if(board[r][c] == word[0]){
25                    bool found = dfs(r,c,R,C,board,word,1);
26                    if(found) return true;
27                }
28            }
29        }
30        return false;
31    }
32};