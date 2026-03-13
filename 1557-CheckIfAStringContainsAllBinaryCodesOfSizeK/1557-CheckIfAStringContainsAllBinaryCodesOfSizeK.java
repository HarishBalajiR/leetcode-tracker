// Last updated: 3/13/2026, 8:16:52 PM
class Solution {
    public boolean hasAllCodes(String s, int k) {
        HashSet<String> map = new HashSet<>();
        for(int left = 0 ; left+k <= s.length() ; left++){
            map.add(s.substring(left,left+k));
        }
        if(map.size() == Math.pow(2,k)) return true;
        return false;
    }
}