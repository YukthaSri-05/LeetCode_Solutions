// Last updated: 9/15/2025, 8:38:06 PM
class Solution {
    public int minimumOperations(int[] nums) {
        int ops = 0;
        for (int num : nums) {
            if (num % 3 != 0) {
                ops += 1; 
            }
        }
        return ops;
    }
}
