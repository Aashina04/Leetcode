class Solution {
    public int xorOperation(int n, int start) {
        int i,ans;
        int nums[]=new int[n];
        for(i=0;i<n;i++)
        {
            nums[i]=start+2*i;
        }
        ans=nums[0];
        for(i=1;i<n;i++)
        {
            ans=ans^nums[i];
        }

        return ans;
    }
}