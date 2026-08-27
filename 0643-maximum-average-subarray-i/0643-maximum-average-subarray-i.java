class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i=0;
        int sum=0;
        int msum=0;
        while(i<k)
        {
           sum+=nums[i];
           i++;
        }
        msum=sum;
        for(int j=k;j<nums.length;j++)
        {
           sum=sum+nums[j]-nums[j-k];
           if(sum>msum)
           {
            msum=sum;
           }
           
        }
        return (double)msum/k;
    }
}