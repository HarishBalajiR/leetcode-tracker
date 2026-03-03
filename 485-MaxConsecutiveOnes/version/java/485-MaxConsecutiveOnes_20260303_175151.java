// Last updated: 3/3/2026, 5:51:51 PM
/*
 * Two Pointer appraoch.
 * slow -> to keep track of 0's
 * fast -> to iterate over 1's
 * count -> current count
 * max -> maximum count
 * last condition is used so if count > max and nums[] does not have a zero then return count
*/

1class Solution {
2    public int findMaxConsecutiveOnes(int[] nums) {
3        int slow = 0, fast = 0;
4        int n = nums.length;
5        int count = 0, max = 0;
6        while(fast < n){
7            if(nums[fast]!=1){
8                max = count > max ? count : max;
9                fast++;
10                count = 0;
11            }
12            else{
13                count++;
14                fast++;
15            }
16        }
17        return max>count ? max : count;
18    }
19}