// Last updated: 3/13/2026, 8:16:31 PM
class Solution {
public:
    vector<int> buildArray(vector<int>& nums) {
        vector<int> result;
        for(int index = 0 ; index < nums.size() ; index++){
            result.push_back(nums[nums[index]]);
        }
        return result;
    }
};