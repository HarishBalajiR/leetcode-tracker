// Last updated: 3/4/2026, 4:55:41 PM
/*
 * Same logic as Java.
 * Learnt how to use .find() and .at()
 * Learnt that .insert() is not the same as hashmap[key] = value
*/

1class Solution {
2public:
3    bool containsNearbyDuplicate(vector<int>& nums, int k) {
4        unordered_map<int,int> hashmap;
5        int n = nums.size();
6        for(int index = 0 ; index < n ; index++){
7            if(hashmap.find(nums[index]) != hashmap.end() && abs(index - hashmap.at(nums[index]))<=k) return true;
8            hashmap[nums[index]] = index;
9        }
10        return false;
11    }
12};