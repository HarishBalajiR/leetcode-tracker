// Last updated: 3/13/2026, 8:16:23 PM
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int result = 0;
        for(String str : operations){
            if(str.contains("-")) result--;
            else result++;
        }
        return result;
    }
}