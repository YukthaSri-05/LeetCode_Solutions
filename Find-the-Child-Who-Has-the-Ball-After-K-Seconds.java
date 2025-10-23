class Solution {
    public int numberOfChild(int n, int k) {
        int cycle = 2 * (n - 1);
        int x = k % cycle;
        if (x < n)
            return x;
        else
            return cycle - x;
    }
}
