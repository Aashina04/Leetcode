class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int i,j,c;
        int l=nums.length;
        int ar[]=new int[l];
        for(i=0;i<l;i++)
        {
            c=0;
            for(j=0;j<l;j++)
            {
                if((j!=i)&&(nums[j]<nums[i]))
                c++;
            }
            ar[i]=c;
        }
        return ar;
        
    }
}