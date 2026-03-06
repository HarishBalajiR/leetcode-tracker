// Last updated: 3/6/2026, 9:29:27 AM
/*
 * Trapping Rain Water. Hard problem but very easy approach.
 * Approach:
 * lefth -> To track the max height from the left of the curr element
 * righth -> To track the max height from the right of the curr element
 * Water in between each index:
 * minheight(lefth,right) - currheight
 * return sum of that
*/

1class Solution {
2public:
3    int trap(vector<int>& height) {
4        vector<int> lefth, righth;
5        int maxheight = -1;
6        for(int currheight : height){
7            if(currheight>=maxheight) maxheight = max(maxheight,currheight);
8            lefth.push_back(maxheight);
9        }      
10        maxheight = -1;
11        reverse(height.begin(),height.end());
12        for(int currheight : height){
13            if(currheight>=maxheight) maxheight = max(maxheight,currheight);
14            righth.push_back(maxheight);
15        }
16        reverse(height.begin(),height.end());
17        reverse(righth.begin(),righth.end());
18        int watercount = 0;
19        int result = 0;
20        for(int index = 0 ; index < height.size() ; index++){
21            int minheight = min(lefth[index],righth[index]);
22            watercount += minheight - height[index];
23            
24        }
25        return watercount;
26    }
27};