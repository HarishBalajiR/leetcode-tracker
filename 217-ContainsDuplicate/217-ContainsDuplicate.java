// Last updated: 3/2/2026, 1:59:39 PM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums) set.add(num);
        if(set.size()==nums.length) return false;
        return true;
    }
}