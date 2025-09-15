// Last updated: 9/15/2025, 8:38:00 PM
class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        return Math.min(n*n, maxWeight/w);
    }
}