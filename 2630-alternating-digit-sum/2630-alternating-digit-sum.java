class Solution {
    public int alternateDigitSum(int n) {
        int d,sum=0,num=0,i=1;
        while(n!=0)
        {
            d=n%10;
            num=num*10+d;
            n=n/10;
        }
        while(num!=0)
        {
            d=num%10;
            sum=sum+(d*i);
            num=num/10;
            i=-i;

        }
        return sum;     
    }
}