// Last updated: 3/30/2026, 11:07:24 AM
1class Solution {
2    public List<List<Integer>> subsets(int[] nums) {
3        
4    List<List<Integer>> list = new ArrayList<>();
5    Arrays.sort(nums);
6    backtrack(list, new ArrayList<>(), nums, 0);
7    return list;
8    }
9
10    private void backtrack(List<List<Integer>> list , List<Integer> tempList, int [] nums, int start){
11        list.add(new ArrayList<>(tempList));
12        for(int i = start; i < nums.length; i++){
13            tempList.add(nums[i]);
14            backtrack(list, tempList, nums, i + 1);
15            tempList.remove(tempList.size() - 1);
16        }
17    }
18}
19