// Last updated: 3/13/2026, 8:16:34 PM
class Solution {
    public boolean checkOnesSegment(String s) {
        char[] arr = s.toCharArray();
        for(int index = 1 ; index < s.length() ; index++){
            if(arr[index] == '1' && arr[index-1] == '0'){
                return false;
            }
        }
        return true;
    }
}