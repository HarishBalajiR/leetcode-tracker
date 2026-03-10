// Last updated: 3/10/2026, 8:41:09 PM
/*
 * so many edge cases wttf.
 * basically take substring upto index(ch) -> reverse it and add it to remaining string.
 * but if the index(0) == index(word.size() - 1) -> dont do anything
 * else do the operation
*/

1class Solution {
2public:
3    string reversePrefix(string word, char ch) {
4        int start = 0;
5        for(int index = 1 ; index < word.size() ; index++){
6            if(word[index]==ch){
7                start+=index;
8                break;
9            }
10        }
11        if(start==word.size() - 1 && word[0] == ch) return word;
12        else{
13            string substring = word.substr(0,start+1);
14            reverse(substring.begin(),substring.end());
15            return substring + word.substr(start+1,word.size() - 1);
16        }
17    }
18};