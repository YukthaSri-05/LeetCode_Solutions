// Last updated: 9/15/2025, 8:37:58 PM
class Solution {
    public int smallestIndex(int[] nums) {
        int index= -1;
        for(int i=0;i<nums.length;i++)
        {
            int sum=0;
            int n=nums[i];
            while(n>0)
            {
                int r = n%10;
                sum=sum+r;
                n/=10;
            }
            if(i==sum)
            {
                if(index==-1 || i<index)
                {
                    index=i;
                }
            }
        }
        return index;
    }
}