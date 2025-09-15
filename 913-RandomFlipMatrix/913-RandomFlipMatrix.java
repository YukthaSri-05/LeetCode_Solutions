// Last updated: 9/15/2025, 8:39:07 PM
import java.util.*;
class Solution {
    int m, n;
    int total;
    Map<Integer, Integer> map;
    Random rand;
    public Solution(int m, int n) {
        this.m = m;
        this.n = n;
        this.total = m * n;
        this.map = new HashMap<>();
        this.rand = new Random();
    }
    public int[] flip() {
        int r = rand.nextInt(total);
        int x = map.getOrDefault(r, r);
        map.put(r, map.getOrDefault(total - 1, total - 1));
        total--;
        return new int[]{x / n, x % n};
    }
    public void reset() {
        map.clear();
        total = m * n;
    }
}
