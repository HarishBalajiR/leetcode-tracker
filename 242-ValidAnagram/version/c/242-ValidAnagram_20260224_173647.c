// Last updated: 2/24/2026, 5:36:47 PM
/*
 * Frequency Array in C.
 * ++ for ch in s 
 * -- for ch in t
 * if everything is 0 return true
 * return false
*/

1bool isAnagram(char* s, char* t) {
2    int freq[256] = {0};
3    for(int i = 0 ; i < strlen(s) ; i++){
4        freq[s[i]]++;
5    }
6    for(int i = 0 ; i < strlen(t) ; i++){
7        freq[t[i]]--;
8    }
9    for(int i = 0 ; i < 127 ; i++){
10        if(freq[i]!=0) return false;
11    }
12    return true;
13}