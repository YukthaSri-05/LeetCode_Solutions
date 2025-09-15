// Last updated: 9/15/2025, 8:38:08 PM
class Solution {
public:
    int scoreOfString(string s) {
        int str = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            str += abs(s[i] - s[i + 1]);
        }
        return str;
    }
};
