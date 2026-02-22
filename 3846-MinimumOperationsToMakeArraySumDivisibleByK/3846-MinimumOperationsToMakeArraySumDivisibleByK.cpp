// Last updated: 2/22/2026, 1:54:24 PM
class Solution {
public:
    int minOperations(vector<int>& nums, int k) {
        int sum = 0;
        for(int i = 0 ; i<nums.size() ; i++) sum+=nums[i];
        return sum%k;
    }
};