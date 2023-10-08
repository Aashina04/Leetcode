class Solution {
    public int countEven(int num) {
        int i,c=0,sum,n,d;
        for(i=1;i<=num;i++)
        {
            sum=0;
            n=i;
            while(n!=0)
            {
                d=n%10;
                sum=sum+d;
                n=n/10;
            }
            if(sum%2==0)
            c++;

        }
        return c;
    }
}