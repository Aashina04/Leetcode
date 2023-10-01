class Solution {
    public int maximumWealth(int[][] accounts) {

        int i,j,max=0,sum;
        for(i=0;i<accounts.length;i++)
        {
            sum=0;
            for(j=0;j<accounts[0].length;j++)
            {
                sum=sum+accounts[i][j];
            }  
            if(sum>=max)
            max=sum;     
         }
        return max;
    }
}