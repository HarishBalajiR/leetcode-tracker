// Last updated: 2/22/2026, 5:39:02 PM
/*
 * Not exactly the approach that was asked.
 * Converted to String and used two pointers for palindrome check.
 * Need to learn on the optimal approach.
*/

1class Solution {
2    public boolean isPalindrome(int x) {
3        if(x==0) return true;
4        if(x<0) return false;
5        if(x%10==0) return false;
6        if(x<10) return true;
7        String s = Integer.toString(x);
8        char[] arr = s.toCharArray();
9        int l = 0 , r = s.length() - 1;
10        while(l<r){
11            if(arr[l]!=arr[r]) return false;
12            l++;
13            r--;
14        }
15        return true;
16    }
17}