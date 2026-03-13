// Last updated: 3/13/2026, 8:15:42 PM
class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int n = capacity.length;
        int mincapacity = 101,minindex = -1;
        for(int index = 0 ; index < n ; index++){
            if(capacity[index] >= itemSize && capacity[index] < mincapacity){
                minindex = index;
                mincapacity = capacity[index];
            }
        }
        return minindex;
    }
}