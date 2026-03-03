// Last updated: 3/3/2026, 10:55:41 AM
1class Solution {
2public:
3    string mergeAlternately(string word1, string word2) {
4        int len1 = word1.size(), len2 = word2.size();
5        int index = 0;
6        string result = "";
7        while(index < len1 && index < len2){
8            result+=word1[index];
9            result+=word2[index];
10            index++;
11        }
12        while(index < len1){
13            result+=word1[index];
14            index++;
15        }
16        while(index < len2){
17            result+=word2[index];
18            index++;
19        }
20        return result;
21    }
22};