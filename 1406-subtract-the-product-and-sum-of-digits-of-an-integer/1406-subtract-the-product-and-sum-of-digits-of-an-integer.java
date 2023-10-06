class Solution {
    public int subtractProductAndSum(int n) {
        int d,sum=0,product=1;
        while(n!=0)
        {
            d=n%10;
            sum=sum+d;
            product=product*d;
            n=n/10;
        }
        return product-sum;
        
    }
}