// Last updated: 3/13/2026, 8:15:55 PM
class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int N = order.length, F = friends.length;
        int[] result = new int[F];
        int ctr = 0;
        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < F ; j++){
                if(order[i] == friends[j]){
                    result[ctr] = order[i];
                    ctr++;
                }
            }
        }
        return result;
    }
}