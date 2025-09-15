// Last updated: 9/15/2025, 8:39:29 PM
class Solution {
    public String toHex(int num) {
        if (num == 0) return "0";

        char[] hexChars = "0123456789abcdef".toCharArray();
        StringBuilder hex = new StringBuilder();
        while (num != 0 && hex.length() < 8) {
            hex.append(hexChars[num & 15]); 
            num >>>= 4; 
        }
        return hex.reverse().toString();
    }
}
