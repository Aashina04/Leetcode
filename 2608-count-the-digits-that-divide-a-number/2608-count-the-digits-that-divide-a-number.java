class Solution {
    public int countDigits(int num) {
        int n,d,c=0;
        n=num;
        while(n!=0)
        {
            d=n%10;
            if(num%d==0)
            c++;
            n=n/10;
        }
        return c;
        
    }
}