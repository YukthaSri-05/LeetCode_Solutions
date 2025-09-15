// Last updated: 9/15/2025, 8:38:13 PM
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int x = arrivalTime + delayedTime;
        if (x >= 24) {
            return x % 24;  
        } else {
            return x;
        }
    }
}
