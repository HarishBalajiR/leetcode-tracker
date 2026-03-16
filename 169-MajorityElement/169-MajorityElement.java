// Last updated: 3/16/2026, 8:23:11 AM
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        int ans = 0;
        for(int num : nums) map.put(num,map.getOrDefault(num,0)+1);
        for(int key : map.keySet()){
            if(map.get(key) > n/2){
                ans = key;
            }
        }
        return ans;
    }
}