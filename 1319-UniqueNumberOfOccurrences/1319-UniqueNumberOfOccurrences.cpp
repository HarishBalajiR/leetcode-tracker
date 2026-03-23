// Last updated: 3/23/2026, 5:00:43 PM
class Solution {
public:
    bool uniqueOccurrences(vector<int>& arr) {
        unordered_map<int,int> hashmap;
        for(int num : arr) hashmap[num]++;
        vector<int> freq;
        for(auto val : hashmap) freq.push_back(val.second);
        set<int> seen;
        for(int val : freq) seen.insert(val);
        return seen.size()==freq.size();
    }
};