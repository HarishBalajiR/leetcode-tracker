// Last updated: 2/24/2026, 5:48:36 PM
/*
 * char *ptr = strchr(string , char)
 * Index = (int)(ptr - string)
*/

1int firstUniqChar(char* s) {
2    int c[26] = {0};
3    for(int i = 0 ; i < strlen(s) ; i++){
4        c[s[i]-'a']++;
5    }
6    for(int i = 0 ; i < strlen(s) ; i++){
7        if(c[s[i]-'a']==1){
8            char *e = strchr(s,s[i]);
9            return (int)(e - s);
10        }
11    }
12    return -1;
13}