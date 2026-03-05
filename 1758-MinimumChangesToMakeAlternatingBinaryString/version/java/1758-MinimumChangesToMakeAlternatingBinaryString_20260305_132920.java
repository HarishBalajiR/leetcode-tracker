// Last updated: 3/5/2026, 1:29:20 PM
// Same approach as C++ >>> Refer C++ Notes
1class Solution {
2    public int minOperations(String s) {
3        int opcount = 0;
4        char[] arr = s.toCharArray();
5        for(int index = 0 ; index < arr.length ; index++){
6            if(arr[index]=='0' && index%2!=0) opcount++;
7            if(arr[index]=='1' && index%2==0) opcount++;
8        }
9        return Math.min(opcount,s.length() - opcount);
10    }
11}