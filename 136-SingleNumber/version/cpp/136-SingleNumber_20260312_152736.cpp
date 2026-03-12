// Last updated: 3/12/2026, 3:27:36 PM
// XOR -> Remove duplicates.
1class Solution {
2public:
3    int singleNumber(vector<int>& nums) {
4        int result = 0;
5        for(int num : nums) result^=num;
6        return result;
7    }
8};