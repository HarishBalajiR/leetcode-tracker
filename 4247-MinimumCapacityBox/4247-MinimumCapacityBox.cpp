// Last updated: 3/13/2026, 8:15:44 PM
class Solution {
public:
    int minimumIndex(vector<int>& capacity, int itemSize) {
        map<int,int> hashmap;
        for(int index = 0 ; index < capacity.size() ; index++){
            if(hashmap.find(capacity[index]) != hashmap.end()) continue; 
            hashmap[capacity[index]] = index;
        }
        for(auto val : hashmap){
            if(val.first >= itemSize) return val.second;
        }
        return -1;
    }
};