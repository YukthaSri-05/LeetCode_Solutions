// Last updated: 9/15/2025, 8:40:07 PM
class Solution {
public:
    string addBinary(string a, string b) {
        string result = "";
        int carry = 0;
        int i = a.size() - 1;
        int j = b.size() - 1;

        while (i >= 0 || j >= 0 || carry) {
            int sum = carry;

            if (i >= 0) sum += a[i--] - '0';
            if (j >= 0) sum += b[j--] - '0';

            result += (sum % 2) + '0'; // append binary digit
            carry = sum / 2;
        }

        reverse(result.begin(), result.end());
        return result;
    }
};
