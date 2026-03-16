// Last updated: 3/16/2026, 8:22:58 AM
class Solution {
    public void reverseString(char[] arr) {
        int left = 0, right = arr.length - 1;
        while(left < right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}