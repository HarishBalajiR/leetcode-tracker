// Last updated: 2/28/2026, 8:34:04 PM
1class Solution {
2    public int[] minDistinctFreqPair(int[] nums) {
3        Arrays.sort(nums);
4        int[] result = new int[2];
5        HashMap<Integer,Integer> map = new HashMap<>();
6        for(int i : nums) map.put(i,map.getOrDefault(i,0)+1);
7        int min = nums[0];
8        int mincount = map.get(min);
9        boolean flag = false;
10        for(int i = 1 ; i < nums.length ; i++){
11            if(map.get(nums[i])!=mincount){
12                result[0] = min;
13                result[1] = nums[i];
14                flag = true;
15                break;
16            }
17        }
18        if(!flag){
19            result[0] = -1;
20            result[1] = -1;
21        }
22        return result;
23    }
24}