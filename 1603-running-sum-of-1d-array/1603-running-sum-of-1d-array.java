class Solution {
    public int[] runningSum(int[] nums) {
        int runningSum[]=new int[nums.length];
        int i,j,sum;
        for(i=0;i<nums.length;i++)
        {
            sum=0;
            for(j=0;j<=i;j++)
            {
                sum=sum+nums[j];
            }
            runningSum[i]=sum;
        }
        return runningSum;
        
    }
}