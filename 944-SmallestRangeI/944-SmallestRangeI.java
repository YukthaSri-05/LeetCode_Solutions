// Last updated: 9/15/2025, 8:39:03 PM
class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int maxVal = Integer.MIN_VALUE;
        int minVal = Integer.MAX_VALUE;
        for (int num : nums) {
            maxVal = Math.max(maxVal, num);
            minVal = Math.min(minVal, num);
        }
        return Math.max(0, (maxVal - minVal) - 2 * k);
    }
}
