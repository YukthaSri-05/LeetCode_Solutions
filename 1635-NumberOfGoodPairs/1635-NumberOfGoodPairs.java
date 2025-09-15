// Last updated: 9/15/2025, 8:38:37 PM
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] freq = new int[101]; 
        int count = 0;
        for (int num : nums) {
            count += freq[num]; 
            freq[num]++;
        }
        return count;
    }
}
