# Last updated: 2/22/2026, 1:55:04 PM
class Solution:
    def search(self, nums: List[int], target: int) -> int:
        if target in nums: return nums.index(target)
        else: return -1