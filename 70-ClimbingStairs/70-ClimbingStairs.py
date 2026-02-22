# Last updated: 2/22/2026, 1:55:01 PM
class Solution:
    def climbStairs(self, n: int) -> int:
        if(n==0): return 0
        else:
            a,b,s = 0,1,0
            for i in range(n):
                s = a+b
                a = b
                b = s
        return s
