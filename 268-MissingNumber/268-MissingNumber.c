// Last updated: 9/15/2025, 8:39:40 PM
int missingNumber(int* nums, int numsSize) {
    int z=((numsSize)*(numsSize+1))/2;
    int s=0;
    for(int i=0;i<numsSize;i++)
    {
        s+=nums[i];
    }
    return z-s;
}