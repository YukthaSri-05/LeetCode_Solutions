class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] result = new int[num_people];
        int i = 0;  
        int give = 1;  

        while (candies > 0) {
           
            result[i] += Math.min(give, candies);
            candies -= give;
            give++;
            i = (i + 1) % num_people;  
        }

        return result;
    }
}
