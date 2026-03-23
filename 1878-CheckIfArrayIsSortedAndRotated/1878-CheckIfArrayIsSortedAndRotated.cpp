// Last updated: 3/23/2026, 5:00:28 PM
class Solution {
public:
    bool check(vector<int>& nums) {
        int drop = 0,n = nums.size();
        for(int index = 0 ; index < n - 1 ; index++){
            if(nums[index] > nums[index+1]) drop++;    
        }
        if(nums[n-1] > nums[0]) drop++;   
        return drop<=1;
    }
};