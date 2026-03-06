// Last updated: 3/6/2026, 9:11:58 PM
/*
 * I need to study C++ functions.
 * We need a set, map and a vector.
 * set -> If we  dont use set, duplicate bulbs with odd count passes the test cases.
 * map -> to count the number of triggers.
 * vector -> return type is vector.
*/

1class Solution {
2public:
3    vector<int> toggleLightBulbs(vector<int>& bulbs) {
4        set<int> uniquebulbs;
5        unordered_map<int,int> hashmap;
6        for(int bulb : bulbs) hashmap[bulb]++;
7        for(int bulb : bulbs) if(hashmap[bulb]%2!=0) uniquebulbs.insert(bulb);
8        vector<int> result(uniquebulbs.begin(),uniquebulbs.end());
9        sort(result.begin(),result.end());
10        return result;
11    }
12};