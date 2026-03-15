// Last updated: 3/15/2026, 6:16:36 PM
1class Solution {
2public:
3    int firstUniqueEven(vector<int>& nums) {
4        unordered_map<int,int> hashmap;
5        for(int num : nums) hashmap[num]+=1;
6        for(int num : nums){
7            if(hashmap.find(num) != hashmap.end()){
8                if(num%2==0 && hashmap[num]==1) return num;
9            }
10        }
11        return -1;
12    }
13};