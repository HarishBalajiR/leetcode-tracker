// Last updated: 3/8/2026, 8:55:28 PM
/*
 * I tried to do a O(N) solution but i failed.
 * But due to constraints it worked.
 * Need to be optimized.
*/

1class Solution {
2    public int[] recoverOrder(int[] order, int[] friends) {
3        int N = order.length, F = friends.length;
4        int[] result = new int[F];
5        int ctr = 0;
6        for(int i = 0 ; i < N ; i++){
7            for(int j = 0 ; j < F ; j++){
8                if(order[i] == friends[j]){
9                    result[ctr] = order[i];
10                    ctr++;
11                }
12            }
13        }
14        return result;
15    }
16}