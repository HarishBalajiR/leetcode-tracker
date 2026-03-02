// Last updated: 3/2/2026, 1:58:58 PM
class Solution {
    public int minPartitions(String n) {
        int maxdigit = -1;
        for(char ch : n.toCharArray()){
            int digit = ch - '0';
            if(digit>maxdigit) maxdigit = digit;
        }
        return maxdigit;
    }
}