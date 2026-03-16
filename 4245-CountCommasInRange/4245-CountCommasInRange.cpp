// Last updated: 3/16/2026, 8:21:24 AM
class Solution {
public:
    int countCommas(int num) {
        string s = to_string(num);
        int n = s.size();
        if(n<=3) return 0;
        else{
            return num - 999;
        }
    }
};