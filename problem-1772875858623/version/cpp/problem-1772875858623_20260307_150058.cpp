// Last updated: 3/7/2026, 3:00:58 PM
/*
 * Same logic and approach as Java.
 * Refer to Java Notes.
 * find(vec.begin(), vec.end(), value) -> find() for vectors
*/

1class Solution {
2public:
3    int missingMultiple(vector<int>& nums, int k) {
4        for(int value = k ; value <= value*nums.size() ; value+=k){
5            if(find(nums.begin(),nums.end(),value)==nums.end()) return value;
6        }
7        return 0;
8    }
9};