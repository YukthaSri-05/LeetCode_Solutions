// Last updated: 9/15/2025, 8:38:30 PM
class Solution {
    public boolean squareIsWhite(String coordinates)
     {
        int c = coordinates.charAt(0) - 'a' + 1;
        int r = coordinates.charAt(1) - '0';

        if ((r + c) % 2 == 0) {
            return false;
        }

        return true;
    }
}
