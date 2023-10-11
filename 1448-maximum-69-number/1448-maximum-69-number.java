class Solution {
    public int maximum69Number (int num) {
        int d,n=0,n1=0,num1=0,x=0;
        while(num!=0)
        {
            d=num%10;
            n=n*10+d;
            num=num/10;
        }
        while(n!=0)
        {
            d=n%10;
            if((d==6)&&(x==0))
            {
              n1=n1*10+9;
              x++;
            }
            else
            n1=n1*10+d;
            n=n/10;
        }
       return n1;
    }
}