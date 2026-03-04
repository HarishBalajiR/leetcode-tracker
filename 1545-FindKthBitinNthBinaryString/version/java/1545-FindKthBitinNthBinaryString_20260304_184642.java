// Last updated: 3/4/2026, 6:46:42 PM
/*
 * Very Interesting Problem
 * Daily Task from HOPE Mentor.
 * We simulate the string production by using stringbuilder
 * toggle and reverse in same function
 * toggle -> Convert 0 -> 1 and 1 -> 0
 * add it to result
 * return the char at (k-1) becoz k is position
*/

1class Solution {
2    public char findKthBit(int n, int k) {
3        String result = "0";
4        for(int ctr = 1 ; ctr < n ; ctr++){
5            String reversedtoggle = reverse_toggle(result);
6            result += reversedtoggle;
7        }
8        return result.charAt(k-1);
9    }
10    private String reverse_toggle(String s){
11        StringBuilder sb = new StringBuilder(s);
12        for(int index = 0 ; index < sb.length() ; index++){
13            if(sb.charAt(index)=='0') sb.setCharAt(index,'1');
14            else if(sb.charAt(index)=='1') sb.setCharAt(index,'0');
15        }
16        return "1"+sb.reverse().toString();
17    }
18}