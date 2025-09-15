// Last updated: 9/15/2025, 8:37:55 PM
class Solution {
    public boolean checkDivisibility(int n) {
        int i;
        int res=0;
        int r;
        int product=1;
        int temp=n;
        while(temp>0)
        {
            r = temp%10;
            res = res+r;
            product = product*r;
            temp /= 10;
        }
        int ans = res+product;
        if(n%ans==0) return true;
        else return false;
    }
}