# Last updated: 3/2/2026, 1:59:12 PM
class Solution:
    def numSteps(self, s: str) -> int:
        n = int(s,2)
        steps = 0
        while(n!=1):
            if(n%2!=0):
                steps+=1
                n+=1
            else:
                steps+=1
                n//=2
        return steps