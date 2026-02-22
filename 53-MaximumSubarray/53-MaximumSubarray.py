# Last updated: 2/22/2026, 1:55:13 PM
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        s = 0
        mx = nums[0]
        for i in range(len(nums)):
            s+=nums[i]
            if(s>mx): mx = s
            if(s<0): s = 0
        return mx