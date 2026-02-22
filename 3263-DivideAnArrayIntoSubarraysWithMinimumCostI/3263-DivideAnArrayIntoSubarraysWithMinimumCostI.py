# Last updated: 2/22/2026, 1:54:20 PM
class Solution:
    def minimumCost(self, nums: List[int]) -> int:
        first = nums[0]
        min_cost = sorted(nums[1:])
        return first+min_cost[0]+min_cost[1]
            
