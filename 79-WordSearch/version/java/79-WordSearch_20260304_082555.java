// Last updated: 3/4/2026, 8:25:55 AM
/*
 * DFS Basics + Backtracking.
 * boolean found -> result stored.
 * dfs():
 * char ch -> current char save
 * replace with * to mark as visited
 * Check valid condition -> If yes then dfs
 * else backtrack -> replace current char with its char -> return false
*/

1class Solution {
2    public boolean exist(char[][] board, String word) {
3        boolean found = false;
4        int R = board.length, C =board[0].length;
5        char[] arr = word.toCharArray();
6        for(int r = 0 ; r < R ; r++){
7            for(int c = 0 ; c < C ; c++){
8                if(board[r][c]==word.charAt(0)){
9                    found = find(r,c,R,C,board,arr,1);
10                    if(found) return found;
11                }
12            }
13        }
14        return found;
15    }
16    private boolean find(int r, int c, int R, int C, char[][] board,char[] word, int ni){
17        int[] diff = {0,1,0,-1,0};
18        char ch = board[r][c];
19        board[r][c] = '*';
20        if(ni==word.length) return true;
21        for(int di = 0 ; di < 4 ; di++){
22            int adjR = r + diff[di];
23            int adjC = c + diff[di+1];
24            if(adjR >= 0 && adjC >= 0 && adjR < R && adjC < C && board[adjR][adjC] == word[ni]){
25                boolean found = find(adjR, adjC, R, C, board, word, ni+1);
26                if(found) return true;
27            }
28        }
29        board[r][c] = ch;
30        return false; 
31    }
32}