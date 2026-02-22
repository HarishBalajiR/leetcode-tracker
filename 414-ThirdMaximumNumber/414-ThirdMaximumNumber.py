# Last updated: 2/22/2026, 1:54:53 PM
class Solution:
    def thirdMax(self, nums: List[int]) -> int:
        first = max(nums)
        while(True):
            if first in nums:
                nums.remove(first)
            else:
                break

        if(nums==[]): return first

        second = max(nums)
        while(True):
            if second in nums:
                nums.remove(second)
            else:
                break

        new = 0
        if(first > second): new = first
        else: new = second

        if(nums==[]): return new
        third = max(nums)
        return third
            