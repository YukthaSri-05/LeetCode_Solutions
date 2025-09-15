// Last updated: 9/15/2025, 8:39:23 PM
public class Solution {
    public int[] constructRectangle(int area) {
        int width = (int)Math.sqrt(area);  // Start checking from the square root downwards

        while (area % width != 0) {
            width--;
        }

        int length = area / width;
        return new int[]{length, width};
    }
}
