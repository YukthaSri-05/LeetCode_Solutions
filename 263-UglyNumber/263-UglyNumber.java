// Last updated: 9/15/2025, 8:39:42 PM
class Solution {
    public boolean isUgly(int n) {
        if (n <= 0) return false;
        int[] divisors = {2, 3, 5};
        for (int d : divisors) {
            while (n % d == 0) {
                n /= d;
            }
        }
        return n == 1;
    }
}
