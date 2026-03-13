// Last updated: 3/13/2026, 8:17:02 PM
class Solution {
    public int search(int[] arr, int target) {
        int left = 0 , right = arr.length - 1;
        while(left <= right){
            int mid = (left+right)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid] < target) left = mid+1;
            else if(arr[mid] > target) right = mid - 1;
        }
        return -1; 
    }
}