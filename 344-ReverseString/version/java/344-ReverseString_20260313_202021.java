// Last updated: 3/13/2026, 8:20:21 PM
/*
 * Two Pointer Basics.
 * Swap characters from both ends to reverse.
*/

1class Solution {
2    public void reverseString(char[] arr) {
3        int left = 0, right = arr.length - 1;
4        while(left < right){
5            char temp = arr[left];
6            arr[left] = arr[right];
7            arr[right] = temp;
8            left++;
9            right--;
10        }
11    }
12}