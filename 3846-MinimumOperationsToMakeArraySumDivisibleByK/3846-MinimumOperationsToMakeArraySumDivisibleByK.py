# Last updated: 2/22/2026, 1:54:28 PM
class Solution:
    def minOperations(self, nums: List[int], k: int) -> int:
        s = sum(nums)
        return s%k