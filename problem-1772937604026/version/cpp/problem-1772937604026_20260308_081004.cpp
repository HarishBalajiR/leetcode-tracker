// Last updated: 3/8/2026, 8:10:04 AM
// WC contest will update explanation later.
1class Solution {
2public:
3    int minimumIndex(vector<int>& capacity, int itemSize) {
4        map<int,int> hashmap;
5        for(int index = 0 ; index < capacity.size() ; index++){
6            if(hashmap.find(capacity[index]) != hashmap.end()) continue; 
7            hashmap[capacity[index]] = index;
8        }
9        for(auto val : hashmap){
10            if(val.first >= itemSize) return val.second;
11        }
12        return -1;
13    }
14};