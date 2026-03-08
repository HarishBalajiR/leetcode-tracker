// Last updated: 3/8/2026, 3:24:13 PM
/*
 * This is a Medium Question?
 * Take "abab"
 * see which substrings have unique first characters.
 * obviously some substring starting with a___
 * and with b____
 * so theres only 2 --> which is the no. of unique characters.
 * so we used a set to store the unique characters.
*/

1class Solution {
2public:
3    int maxDistinct(string s) {
4        set<char> hashset;
5        for(char ch : s) hashset.insert(ch);
6        return hashset.size();
7    }
8};