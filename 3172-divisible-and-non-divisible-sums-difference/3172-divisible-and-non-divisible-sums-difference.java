class Solution {
    public int differenceOfSums(int n, int m) {
        int i,num1=0,num2=0,diff;
        for(i=1;i<=n;i++)
        {
            if(i%m==0)
            num2=num2+i;
            else
            num1=num1+i;
        }
        diff=num1-num2;
        return diff;

        
    }
}