class Solution {
    public int arraySign(int[] nums) {
        int i,c=1;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]<0)
            c++;
            else if(nums[i]==0)
            {
                c=0;
                break;
            }
        }
        if(c==0)
        return 0;
        else if((c-1)%2==0)
        return 1;
        else
        return -1;
        
      }
}