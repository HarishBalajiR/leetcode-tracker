// Last updated: 3/6/2026, 8:31:13 AM
/*
 * Interesting Binary string problem
 * Continguous Segment of Ones -> "1100" or "0011"
 * 110011 -> No cause it has 2 segments.
 * 
 * Approach:
 * Check if "01" occurs -> end of continguous segment
 * if yes return false else return true
*/

1class Solution {
2    public boolean checkOnesSegment(String s) {
3        char[] arr = s.toCharArray();
4        for(int index = 1 ; index < s.length() ; index++){
5            if(arr[index] == '1' && arr[index-1] == '0'){
6                return false;
7            }
8        }
9        return true;
10    }
11}