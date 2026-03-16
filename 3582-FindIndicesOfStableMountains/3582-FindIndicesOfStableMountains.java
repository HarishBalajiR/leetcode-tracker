// Last updated: 3/16/2026, 9:23:05 PM
class Solution {
    public List<Integer> stableMountains(int[] height, int threshold) {
        List<Integer> result = new ArrayList<>();
        int n = height.length;
        for(int index = 1 ; index < n ; index++){
            if(height[index-1] > threshold) result.add(index);
        }
        return result;
    }
}