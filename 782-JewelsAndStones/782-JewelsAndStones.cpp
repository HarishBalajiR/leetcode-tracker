// Last updated: 3/23/2026, 5:00:53 PM
class Solution {
public:
    int numJewelsInStones(string jewels, string stones) {
        int count = 0;
        unordered_map<int,int> hashmap;
        for(char ch : jewels) hashmap[ch]++;
        for(char ch : stones){
            if(hashmap.count(ch)) count++;
        }
        return count;
    }
};