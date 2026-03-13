// Last updated: 3/13/2026, 8:16:22 PM
class Solution {
public:
    int finalValueAfterOperations(vector<string>& operations) {
        int result = 0;
        for(string st : operations){
            result+= st[1] == '+' ? 1 : -1;
        }
        return result;
    }
};