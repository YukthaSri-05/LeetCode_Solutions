// Last updated: 9/15/2025, 8:38:40 PM
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            result[idx++] = nums[i];     
            result[idx++] = nums[i + n]; 
        }

        return result;
    }
}
