# Last updated: 9/15/2025, 8:39:46 PM
class Solution:
    def isPowerOfTwo(self, n: int) -> bool:
        t=0
        while pow(2,t)<=n:
            if pow(2,t)==n:
                return True
            else:
                t+=1
        return False