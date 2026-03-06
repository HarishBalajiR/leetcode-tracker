// Last updated: 3/6/2026, 11:49:38 AM
/*
 * Same approach as Java.
 * Refer Java Notes.
*/

1class Solution {
2public:
3    int subarraySum(vector<int>& nums, int k) {
4        int subcount = 0, currsum = 0, n = nums.size();
5        map<int,int> hashmap;
6        hashmap[0] = 1;
7        for(int left = 0 ; left < n ; left++){
8            currsum+=nums[left];
9            if(hashmap.find(currsum-k)!=hashmap.end()) subcount+=hashmap[currsum-k];
10            if(hashmap.find(currsum)!=hashmap.end()) hashmap[currsum]++;
11            else hashmap[currsum] = 1;
12        }
13        return subcount;
14    }
15};