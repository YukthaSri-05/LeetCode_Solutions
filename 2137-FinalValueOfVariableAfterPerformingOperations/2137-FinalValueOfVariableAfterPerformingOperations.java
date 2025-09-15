// Last updated: 9/15/2025, 8:38:19 PM
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String op : operations) {
            if (op.contains("++")) {
                x++;
            } else {
                x--;
            }
        }
        return x;
    }
}
