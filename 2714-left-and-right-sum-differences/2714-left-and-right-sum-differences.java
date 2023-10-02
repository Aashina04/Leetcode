class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int answer[]=new int[n];
        int i,j,k,leftsum,rightsum;
        for(i=0;i<n;i++)
        {
            leftsum=0;
            rightsum=0;
            for(j=0;j<i;j++)
            {
                leftsum=leftsum+nums[j];
            }
            for(k=i+1;k<n;k++)
            {
                rightsum=rightsum+nums[k];
            }
            answer[i]=Math.abs(leftsum-rightsum);
        }
        return answer;
        
    }
}