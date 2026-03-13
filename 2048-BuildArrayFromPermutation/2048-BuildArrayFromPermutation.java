// Last updated: 3/13/2026, 8:16:27 PM
class Solution {
    public int[] buildArray(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i = 0 ; i < nums.length ; i++){
            arr[i] = nums[nums[i]];
        }
        return arr;
    }
}