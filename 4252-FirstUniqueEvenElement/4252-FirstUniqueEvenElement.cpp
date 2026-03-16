// Last updated: 3/16/2026, 8:21:21 AM
class Solution {
public:
    int firstUniqueEven(vector<int>& nums) {
        unordered_map<int,int> hashmap;
        for(int num : nums) hashmap[num]+=1;
        for(int num : nums){
            if(hashmap.find(num) != hashmap.end()){
                if(num%2==0 && hashmap[num]==1) return num;
            }
        }
        return -1;
    }
};