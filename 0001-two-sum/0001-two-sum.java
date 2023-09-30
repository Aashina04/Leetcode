class Solution {
    public int[] twoSum(int[] nums, int target) {
      int i,j,num,sum=0;
      int l=nums.length;
      int[] arr=new int[2];
      for(i=0;i<l-1;i++)
      {
        num=nums[i];
        for(j=i+1;j<l;j++)
        {
          if(num+nums[j]==target)
          {
            arr[0]=i;
            arr[1]=j;
            break;
          }
        }  
      }
      return arr;
    }
}
      