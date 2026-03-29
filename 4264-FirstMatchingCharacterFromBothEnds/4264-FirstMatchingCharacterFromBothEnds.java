// Last updated: 3/29/2026, 11:14:44 AM
class Solution {
    public int firstMatchingIndex(String s) {
        char[] arr = s.toCharArray();
        int n = s.length();
        for(int index = 0 ; index < n ; index++){
            if(arr[index]==arr[n-index-1]) return index;
        }
        return -1;
    }
}