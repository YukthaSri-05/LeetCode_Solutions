// Last updated: 9/15/2025, 8:38:39 PM
class Solution {
    public int countOdds(int low, int high) {
       int x = high-low;
       if(high%2==1||low%2==1){
        return x/2+1;
       }
       else{
        return x/2;
       }
    }
}