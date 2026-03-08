// Last updated: 3/8/2026, 3:48:15 PM
/*
 * Easy problem. Reached 90 only 910 more.
 * X-- and --X both do the same thing -> result--
 * same for X++ and ++X
 * So we just check if "-" is present then -- or else ++
*/

1class Solution {
2    public int finalValueAfterOperations(String[] operations) {
3        int result = 0;
4        for(String str : operations){
5            if(str.contains("-")) result--;
6            else result++;
7        }
8        return result;
9    }
10}