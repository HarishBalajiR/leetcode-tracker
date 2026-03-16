// Last updated: 3/16/2026, 8:21:16 AM
class Solution {
    public int firstUniqueEven(int[] nums) {
        HashMap<Integer,Integer> map = new LinkedHashMap<>();
        for(int num : nums) map.put(num,map.getOrDefault(num,0)+1);
        for(int key : map.keySet()){
            if(key%2==0 && map.get(key)==1) return key;
        }
        return -1;
    }
}