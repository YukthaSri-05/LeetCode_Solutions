import java.util.*;

class Solution {
    public static int smallestNumber(int n, int t) {
        while (true) {
            int prod = productOfDigits(n);
            if (prod % t == 0) {
                return n;
            }
            n++;
        }
    }

    private static int productOfDigits(int num) {
        int prod = 1;
        while (num > 0) {
            int digit = num % 10;
            prod *= digit;
            num /= 10;
        }
        return prod;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        System.out.println(smallestNumber(n, t));
    }
}
