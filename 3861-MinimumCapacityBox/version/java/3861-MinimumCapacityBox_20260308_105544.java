// Last updated: 3/8/2026, 10:55:44 AM
/*
 * This is a different approach than C++.
 * We iterate thru the array and update the minindex iff capacity > mincapacity and capacity[i] >= itemSize.
 * mincapacity -> capacity of smallest box which can hold itemSize
*/

1class Solution {
2    public int minimumIndex(int[] capacity, int itemSize) {
3        int n = capacity.length;
4        int mincapacity = 101,minindex = -1;
5        for(int index = 0 ; index < n ; index++){
6            if(capacity[index] >= itemSize && capacity[index] < mincapacity){
7                minindex = index;
8                mincapacity = capacity[index];
9            }
10        }
11        return minindex;
12    }
13}