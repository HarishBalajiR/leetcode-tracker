// Last updated: 2/22/2026, 1:55:08 PM
class Solution {
    public int removeDuplicates(int[] nums) {
        int l = 1, r = 1;
        int n = nums.length;
        while(r<n){
            if(nums[r]!=nums[r-1]){
                nums[l] = nums[r];
                l++;
            }
            r++;
        }
        return l; 
    }
}