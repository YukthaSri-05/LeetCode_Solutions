// Last updated: 9/15/2025, 8:39:48 PM
class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2,
                           int bx1, int by1, int bx2, int by2) {
        int area1 = (ax2 - ax1) * (ay2 - ay1);
        int area2 = (bx2 - bx1) * (by2 - by1);
        int overlapX1 = Math.max(ax1, bx1);
        int overlapY1 = Math.max(ay1, by1);
        int overlapX2 = Math.min(ax2, bx2);
        int overlapY2 = Math.min(ay2, by2);
        int overlapArea = 0;
        if (overlapX1 < overlapX2 && overlapY1 < overlapY2) {
            overlapArea = (overlapX2 - overlapX1) * (overlapY2 - overlapY1);
        }
        return area1 + area2 - overlapArea;
    }
}
