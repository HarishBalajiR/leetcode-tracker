// Last updated: 3/13/2026, 8:16:56 PM
class Solution {
    public int bitwiseComplement(int n) {
        String bin = Integer.toBinaryString(n);
        int result = 0, place = bin.length() - 1;
        for(char ch : bin.toCharArray()){
            if(ch=='1'){
                place--;
                continue;
            }
            else {
                result += (int)Math.pow(2,place);
                //System.out.println(result+ " " + place);
            }
            place--;
        }
        return result;
    }
}
/*
101
1 -> continue -> place = 2 - 1 = 1
0 -> result = 2 ^ 1 = 2
1 -> continue
return 1 nice
*/