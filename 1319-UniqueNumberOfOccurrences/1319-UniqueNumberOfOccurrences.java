// Last updated: 3/23/2026, 5:00:42 PM
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int num : arr) freq.put(num,freq.getOrDefault(num,0)+1);
        HashSet<Integer> seen = new HashSet<>();
        for(int num : freq.values()){
            seen.add(num);
        }
        return freq.size()==seen.size();
    }
}