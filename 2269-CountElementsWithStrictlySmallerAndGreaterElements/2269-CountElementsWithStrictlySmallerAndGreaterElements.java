// Last updated: 3/24/2026, 5:30:42 PM
class Solution {
    public int countElements(int[] nums) {
        int max = Integer.MIN_VALUE,min = Integer.MAX_VALUE;
        for(int num : nums){
            if(num < min) min = num;
            if(num > max) max = num;
        }
        int count = 0;
        for(int num : nums){
            if(num > min && num < max) count++;
        }
        return count;
    }
}