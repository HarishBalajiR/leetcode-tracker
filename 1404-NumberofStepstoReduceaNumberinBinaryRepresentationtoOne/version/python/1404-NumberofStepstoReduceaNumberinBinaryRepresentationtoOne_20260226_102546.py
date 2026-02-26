# Last updated: 2/26/2026, 10:25:46 AM
'''
Python Solution.
Convert BInary String using int(str,2) --> 2 is base
Iterate until it becomes 1
Need to be solved in Java or C++
'''

1class Solution:
2    def numSteps(self, s: str) -> int:
3        n = int(s,2)
4        steps = 0
5        while(n!=1):
6            if(n%2!=0):
7                steps+=1
8                n+=1
9            else:
10                steps+=1
11                n//=2
12        return steps