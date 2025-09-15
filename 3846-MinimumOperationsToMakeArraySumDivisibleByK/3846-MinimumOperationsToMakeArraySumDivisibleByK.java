// Last updated: 9/15/2025, 8:37:57 PM
class Solution {
    public int minOperations(int[] nums, int k) {
        int sum=0;
        for(int x : nums)
        {
            sum = sum+x;
        }
        return sum%k;
    }
}