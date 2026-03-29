// Last updated: 3/29/2026, 11:14:45 AM
class Solution {
public:
    int minAbsoluteDifference(vector<int>& nums) {
        int minz = INT_MAX;
        for(int i = 0 ; i < nums.size() ; i++){
            for(int j = 0 ; j < nums.size() ; j++){
                if(nums[i]==1 && nums[j]==2){
                    minz = min(minz,abs(i-j));
                }
            }
        }
        if(minz!=INT_MAX) return minz;
        else return -1;
    }
};