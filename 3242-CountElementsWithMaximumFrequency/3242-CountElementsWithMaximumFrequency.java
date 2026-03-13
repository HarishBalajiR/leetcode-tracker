// Last updated: 3/13/2026, 8:16:08 PM
class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums) map.put(num,map.getOrDefault(num,0)+1);
        int maxfreq = 0;
        for(int value : map.values()) maxfreq = Math.max(maxfreq,value);
        int result = 0;
        for(int key : map.keySet()){
            if(map.get(key) == maxfreq) result+=map.get(key);
        }
        return result;
    }
}