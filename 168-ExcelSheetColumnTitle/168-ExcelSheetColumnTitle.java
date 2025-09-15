// Last updated: 9/15/2025, 8:39:57 PM
class Solution {
    public String convertToTitle(int n) {
        StringBuilder s = new StringBuilder();
        while (n > 0) {
            n--; // adjust for 0-based indexing
            int r = n % 26;
            s.append((char) ('A' + r));
            n /= 26;
        }
        return s.reverse().toString();
    }
}
