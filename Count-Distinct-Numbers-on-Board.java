import java.util.*;

public class Solution {
    public int distinctIntegers(int n) {
        if (n == 1) return 1;
        return n - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(new Solution().distinctIntegers(n));
    }
}
