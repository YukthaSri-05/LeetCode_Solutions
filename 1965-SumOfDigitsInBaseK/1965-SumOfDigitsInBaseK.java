// Last updated: 9/15/2025, 8:38:28 PM
class Solution {
    public int sumBase(int n, int k) {
        int sum = 0;
        while(n>0)
        {
            sum += n%k;
            n = n/k;
        }
        return sum;
    }
}