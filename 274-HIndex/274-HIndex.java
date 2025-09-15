// Last updated: 9/15/2025, 8:39:38 PM
import java.util.Arrays;
class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);  
        int n = citations.length;
        int h = 0;
        for (int i = 0; i < n; i++) {
            int papersWithAtLeastCitations = n - i;
            if (citations[i] >= papersWithAtLeastCitations) {
                h = papersWithAtLeastCitations;
                break;
            }
        }
        return h;
    }
}
