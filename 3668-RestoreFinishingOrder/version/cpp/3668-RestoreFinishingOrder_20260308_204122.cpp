// Last updated: 3/8/2026, 8:41:22 PM
/*
 * Good problem. Improve logical thinking.
 * Check if my friend has finished the race
 * -> If yes pushback into result vector
 * -> else do nothing
*/

1class Solution {
2public:
3    vector<int> recoverOrder(vector<int>& order, vector<int>& friends) {
4        vector<int> result;
5        unordered_map<int,int> hashmap;
6        int N = order.size(), F = friends.size();
7        for(int index = 0 ; index < N ; index++){
8            if(find(friends.begin(),friends.end(),order[index]) != friends.end()) result.push_back(order[index]);
9        }
10        return result;
11    }
12};