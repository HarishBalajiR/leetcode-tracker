// Last updated: 3/13/2026, 8:16:33 PM
class Solution {
public:
    string mergeAlternately(string word1, string word2) {
        int len1 = word1.size(), len2 = word2.size();
        int index = 0;
        string result = "";
        while(index < len1 && index < len2){
            result+=word1[index];
            result+=word2[index];
            index++;
        }
        while(index < len1){
            result+=word1[index];
            index++;
        }
        while(index < len2){
            result+=word2[index];
            index++;
        }
        return result;
    }
};