// Last updated: 9/15/2025, 8:38:17 PM
class Solution {
    public int findClosestNumber(int[] nums) {
        int closest = nums[0];

        for (int num : nums) {
            if (Math.abs(num) < Math.abs(closest) ||
                (Math.abs(num) == Math.abs(closest) && num > closest)) {
                closest = num;
            }
        }

        return closest;
    }
}
