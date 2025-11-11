import java.util.*;

class Solution {
    public int countPairs(List<Integer> nums, int target) {
       
        int n = nums.size();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = nums.get(i);

        Arrays.sort(arr);
        int left = 0, right = n - 1, count = 0;

        while (left < right) {
            if (arr[left] + arr[right] < target) {
                count += (right - left);
                left++;
            } else {
                right--;
            }
        }
        return count;
    }
}
