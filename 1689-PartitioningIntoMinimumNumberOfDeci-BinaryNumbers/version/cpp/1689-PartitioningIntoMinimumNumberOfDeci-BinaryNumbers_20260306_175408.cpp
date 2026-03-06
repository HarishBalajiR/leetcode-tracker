// Last updated: 3/6/2026, 5:54:08 PM
/*
 * Return the maximum digit of the given number.
 * Because if there exists a digit, there should be a '1' in the binary numbers which are added to it.
 * 827438
 * 1 . . . .
 * 1 . . . .
 * 1 . . . .
 * upto 8 times.
 * So we return the max digit.
*/

1class Solution {
2public:
3    int minPartitions(string n) {
4        int maxdigit = 0;
5        for(char  ch : n){
6            maxdigit = max(maxdigit,ch-'0');
7        }
8        return maxdigit;
9    }
10};