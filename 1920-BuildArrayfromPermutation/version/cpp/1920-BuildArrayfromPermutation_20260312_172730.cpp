// Last updated: 3/12/2026, 5:27:30 PM
1class Solution {
2public:
3    vector<int> buildArray(vector<int>& nums) {
4        vector<int> result;
5        for(int index = 0 ; index < nums.size() ; index++){
6            result.push_back(nums[nums[index]]);
7        }
8        return result;
9    }
10};