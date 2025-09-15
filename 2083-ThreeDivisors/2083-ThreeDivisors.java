// Last updated: 9/15/2025, 8:38:20 PM
class Solution {
    public boolean isThree(int n) {
        int sum = 0;
        for(int i=1; i<=n;i++)
        {
            
            if(n%i==0)
            {
                sum++;
            }
        }
        if(sum==3)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}