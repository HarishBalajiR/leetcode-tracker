// Last updated: 3/13/2026, 8:16:02 PM
class Solution {
public:
    int minimumOperations(vector<int>& nums) {
        int op = 0;
        for(int num : nums) if(num%3!=0) op++;
        return op;
    }
};