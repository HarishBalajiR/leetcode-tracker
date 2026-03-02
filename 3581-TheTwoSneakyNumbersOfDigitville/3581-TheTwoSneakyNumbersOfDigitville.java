// Last updated: 3/2/2026, 1:58:32 PM
class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] result = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num: nums) map.put(num,map.getOrDefault(num,0)+1);
        int i = 0;
        for(int key: map.keySet()){
            int count = map.get(key);
            if(count==2){
                result[i] = key;
                i++;
            }
        }
        return result; 
    }
}