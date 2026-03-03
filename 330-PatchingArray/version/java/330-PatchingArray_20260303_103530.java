// Last updated: 3/3/2026, 10:35:30 AM
/*
 * Patching Array (Hard).
 * long till -> we can measure till...
 * valid patch condition -> till < n and till < nums[i] - 1 -> patch++
 * 
 * If n is very large, even after array is ended, till is not satisfied.
 * so the extra while loop at last.
*/

1class Solution {
2    public int minPatches(int[] nums, int n) {
3        long till = 0;
4        int patch = 0;
5        for(int index = 0 ; index < nums.length && till < n ; index++){
6            while(till < n && till < nums[index]-1){
7                patch++;;
8                till+=till+1;
9            }
10            till+=nums[index];
11        }
12        while(till < n){
13            patch++;
14            till+=till+1;
15        }
16        return patch;
17    }
18}
19//MEX -> Maximum EXcluded element -> Smallest element that does not exist in the array.
20/* till = 1
211 > 1 ? -> no
22till = 6
236 > 5 -> yes
24patch++;
2516 > 10 -> yes
26patch++
27*/