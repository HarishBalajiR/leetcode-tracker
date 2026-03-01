// Last updated: 3/1/2026, 8:35:53 AM
1class Solution {
2    public String trimTrailingVowels(String s) {
3        String result = "";
4        char[] arr = s.toCharArray();
5        int right = arr.length - 1;
6        while(true && right>=0){
7            if(arr[right]=='a' || arr[right]=='e' || arr[right]=='o' || arr[right]=='i' || arr[right]=='u') right--;
8            else break;
9        }
10        if(right==0){
11            if(s.length()==1){
12                if(arr[0]=='b') return s;
13                else return "";
14            }
15            else{
16                result+=arr[0];
17                return result;
18            }
19        }
20        else if(right==-1) return "";
21        else{
22            for(int left = 0 ; left <= right ; left++) result+=arr[left];
23        }
24        return result;
25    }
26}