class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int digitsum=0;
        int i,d,digit,diff;
        for(i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
            digit=nums[i];
            while(digit!=0)
            {
                d=digit%10;
                digitsum=digitsum+d;
                digit=digit/10;
            }


        }
        diff=Math.abs(sum-digitsum);
        return diff;
        
    }
}