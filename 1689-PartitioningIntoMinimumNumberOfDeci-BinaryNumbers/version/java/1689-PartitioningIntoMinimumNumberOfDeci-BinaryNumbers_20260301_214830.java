// Last updated: 3/1/2026, 9:48:30 PM
/*
 * Fun problem to brainstorm.
 * Basically the max digit is the answer. Because
 * lets say 23874-> we need 8 deci-binary numbers to sum up to it.
 * because for every number we replace with 0 8 will always remain 1 until 8 times.
*/

1class Solution {
2    public int minPartitions(String n) {
3        int maxdigit = -1;
4        for(char ch : n.toCharArray()){
5            int digit = ch - '0';
6            if(digit>maxdigit) maxdigit = digit;
7        }
8        return maxdigit;
9    }
10}