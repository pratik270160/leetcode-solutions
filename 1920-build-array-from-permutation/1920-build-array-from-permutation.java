class Solution {
    public int[] buildArray(int[] nums) {
        int index=0;
        int result[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            index=nums[i];
           result[i]=nums[index];
        }
        return result;
    }
}