// Last updated: 3/13/2026, 8:15:52 PM
class Solution {
public:
    int missingMultiple(vector<int>& nums, int k) {
        for(int value = k ; value <= value*nums.size() ; value+=k){
            if(find(nums.begin(),nums.end(),value)==nums.end()) return value;
        }
        return 0;
    }
};