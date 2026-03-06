// Last updated: 3/6/2026, 10:14:56 AM
/*
 * Same approach as Java.
 * Refer Java notes.
*/

1class Solution {
2public:
3    int maxArea(vector<int>& height) {
4        int n = height.size();
5        int left = 0, right = n -1;
6        int maxwater = 0;
7        while(left < right){
8            int currwater = min(height[left],height[right]) * (right-left);
9            maxwater = max(maxwater,currwater);
10            if(height[left] <= height[right]) left++;
11            else right--;
12        }
13        return maxwater;
14    }
15};