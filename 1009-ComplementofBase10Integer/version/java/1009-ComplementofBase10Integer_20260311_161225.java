// Last updated: 3/11/2026, 4:12:25 PM
/*
 * Simple Binary Problem.
 * Convert -> BinaryString
 * Iterate -> 1 ? skip
 * 0 ? add the correct 2 ^ place to result.
 * return result
*/

1class Solution {
2    public int bitwiseComplement(int n) {
3        String bin = Integer.toBinaryString(n);
4        int result = 0, place = bin.length() - 1;
5        for(char ch : bin.toCharArray()){
6            if(ch=='1'){
7                place--;
8                continue;
9            }
10            else {
11                result += (int)Math.pow(2,place);
12                //System.out.println(result+ " " + place);
13            }
14            place--;
15        }
16        return result;
17    }
18}
19/*
20101
211 -> continue -> place = 2 - 1 = 1
220 -> result = 2 ^ 1 = 2
231 -> continue
24return 1 nice
25*/