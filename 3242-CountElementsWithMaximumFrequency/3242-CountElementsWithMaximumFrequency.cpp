// Last updated: 3/13/2026, 8:16:05 PM
class Solution {
public:
    int maxFrequencyElements(vector<int>& nums) {
        unordered_map<int,int> hashmap;
        for(int num : nums) hashmap[num]++;
        int maxfreq = 0, result = 0;
        for(auto& val : hashmap){
            maxfreq = max(maxfreq,val.second);
        }
        for(auto& val : hashmap){
            if(val.second == maxfreq) result+=val.second;
        }
        return result;
    }
};