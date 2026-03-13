// Last updated: 3/13/2026, 8:16:40 PM
class Solution {
public:
    int minOperations(string s) {
        int opcount = 0;
        int n = s.size();
        for(int index = 0 ; index < n ; index++){
            if(s[index]=='0' && index%2!=0) opcount++;
            else if(s[index]=='1' && index%2==0) opcount++;
        }
        return min(opcount, n-opcount);
    }
};