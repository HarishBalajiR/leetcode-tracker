// Last updated: 3/5/2026, 11:55:06 AM
/*
 * Interesting String Logic.
 * There are only 2 valid patterns.
 * 0101010101.... or 1010101010....
 * I took the first pattern
 * i check if even indexes have 0's in org string else opcount++
 * i check if odd indexes have 1's in org string else opcount++;
 * 
 * If the org string correctly matches with first pattern
 * return opcount
 * else return n-opcount.
 * (Return minimum of these two asked in the question. read question)
*/

1class Solution {
2public:
3    int minOperations(string s) {
4        int opcount = 0;
5        int n = s.size();
6        for(int index = 0 ; index < n ; index++){
7            if(s[index]=='0' && index%2!=0) opcount++;
8            else if(s[index]=='1' && index%2==0) opcount++;
9        }
10        return min(opcount, n-opcount);
11    }
12};