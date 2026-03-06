// Last updated: 3/6/2026, 9:36:40 AM
/*
 * Same approach as C++.
 * Refer C++ Notes.
 * Submitted in 1st try.
*/

1class Solution {
2    public int trap(int[] height) {
3        int n = height.length;
4        int[] lefth = new int[n];
5        int[] righth = new int[n];
6        int maxheight = 0;
7        for(int index = 0 ; index < n ; index++){
8            if(height[index] > maxheight) maxheight = Math.max(maxheight,height[index]);
9            lefth[index] = maxheight;
10        }
11        maxheight = 0;
12        for(int index = n-1 ; index>=0 ; index--){
13            if(height[index] > maxheight) maxheight = Math.max(maxheight,height[index]);
14            righth[index] = maxheight;
15        }
16        int watercount = 0;
17        for(int index = 0 ; index < n ; index++){
18            watercount += Math.min(lefth[index],righth[index]) - height[index];
19        }
20        return watercount;
21    }
22}