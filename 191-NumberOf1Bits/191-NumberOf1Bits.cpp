// Last updated: 3/2/2026, 1:59:42 PM
class Solution {
public:
    int hammingWeight(int n) {
        int count = 0;
        while(n!=0){
            int bin = n%2;
            if(bin==1) count++;
            n/=2;
        }
        return count;
    }
};