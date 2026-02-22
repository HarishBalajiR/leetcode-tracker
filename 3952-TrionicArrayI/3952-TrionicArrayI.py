# Last updated: 2/22/2026, 1:54:17 PM
class Solution:
    def isTrionic(self, nums: List[int]) -> bool:
        p,q,index,flag = 0,0,0,1
        while(index+1<len(nums)):
            if(nums[index] >= nums[index+1]):
                p = index
                break
            index+=1
        while(index+1<len(nums) and p!=0):
            if(nums[index] <= nums[index+1]):
                q = index
                break
            else: index+=1
        while(index+1<len(nums)):
            if(nums[index] >= nums[index+1]):
                flag = 0
                break
            else:
                index+=1

        if(flag and p and q): return True
        else: return False
            