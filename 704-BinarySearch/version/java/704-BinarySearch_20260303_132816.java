// Last updated: 3/3/2026, 1:28:16 PM
/*
 * Learnt Binary Search today.
 * left<=right -> so we dont skip the mid element in odd length array
 * [1     2     3     4     5]            target = 2 
 *             mid
 * --> right = mid - 1;
 * [1     2    ] 3     4     5   
 *      mid
 * ---> return mid
*/

1class Solution {
2    public int search(int[] arr, int target) {
3        int left = 0 , right = arr.length - 1;
4        while(left <= right){
5            int mid = (left+right)/2;
6            if(arr[mid]==target) return mid;
7            else if(arr[mid] < target) left = mid+1;
8            else if(arr[mid] > target) right = mid - 1;
9        }
10        return -1; 
11    }
12}