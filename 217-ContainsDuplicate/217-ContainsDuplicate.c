// Last updated: 9/15/2025, 8:39:49 PM
#include<stdio.h>
void print_array(int*a,int size)
{
int i;
for(i=0;i<size;i++)
{
	printf("%d ",a[i]);
}
printf("\n");
}
void merge(int *a,int l,int m,int h)
{
	int res[h-l+1];
	int i=l, j=m+1,k=0;
	while(i<=m && j<=h)
	{
		if(a[i]<=a[j])
		{
			res[k]=a[i];
			i++;
			k++;
		}
		else
		{
			res[k]=a[j];
			j++;
			k++;
		}
	}
	while(i<=m)
	{
		res[k]=a[i];
		i++;
		k++;
	}
	while(j<=h)
	{
		res[k]=a[j];
		j++;
		k++;
	}
	k=0;
	for(i=l;i<=h;i++)
	{
		a[i]=res[k];
		k++;
	}
}
void merge_sort(int*a,int l,int h)
{
	if(l<h)
	{
		int m=(l+h)/2;
		merge_sort(a,l,m);
		merge_sort(a,m+1,h);
		merge(a,l,m,h);
	}
}
bool containsDuplicate(int* nums, int numsSize)
{
    int i;
  merge_sort(nums,0,numsSize-1);
    for(i=0;i<numsSize-1;i++)
    {
           if(nums[i]==nums[i+1])
            {
              return true;
            }
        
    } 
    return false;
}