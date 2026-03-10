// Last updated: 3/10/2026, 6:10:37 PM
/*
 * Java approach is much cleaner but this helps me to understand all the base cases of the problem.
 * Left initializing: left should always be at either 1 or -1 so i put up a while loop.
 * 
 * right -> Traverse
 * if we encounter valid condition: 1 and -1 or -1 and 1
 * We update maxcount, reset currcount and bring left to right
 * 
 * if we encounter same sign 1 and 1 or -1 and 1
 * we reset count and bring left to right
 * 
 * if we encounter 0 -> currcount++
 * 
 * return maxcount
*/

1class Solution {
2public:
3    int captureForts(vector<int>& forts) {
4        int currcount = 0, maxcount = 0;
5        int left = 0;
6        int n = forts.size();
7        while(left < n && forts[left] == 0) left++;
8        int right = left + 1;
9        while(right < n){
10            if(forts[left]==1 && forts[right]== -1 || forts[left] == -1 && forts[right]==1){
11                left = right;
12                maxcount = max(maxcount,currcount);
13                currcount = 0;
14            }
15            else if(forts[left] == 1 && forts[right] == 1 || forts[left] == - 1 && forts[right] == -1){
16                left = right;
17                currcount = 0;
18            }
19            else if(forts[right] == 0) currcount++;
20            right++;
21            //cout << currcount << " " << maxcount << endl;
22        }
23        return maxcount;
24    }
25};