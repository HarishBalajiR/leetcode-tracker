// Last updated: 3/3/2026, 10:43:00 AM
/*
 * Same approach as java.
 * long long -> Stops Integer Overflow
*/

1class Solution {
2public:
3    int minPatches(vector<int>& nums, int n) {
4        int patch = 0;
5        long long till = 0;
6        for(int index = 0 ; index < nums.size() && till < n ; index++){
7            while(till < n && till < nums[index] - 1){
8                patch++;
9                till+=till + 1;
10            }
11            till+=nums[index];
12        }
13
14        while(till < n){
15            patch++;
16            till+=till+1;
17        }
18        return patch;
19    }
20};