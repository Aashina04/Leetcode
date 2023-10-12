class Solution {
    public boolean isSameAfterReversals(int num) {
        int reversed1=0,reversed2=0,d;
        int n=num;
        while(num!=0)
        {
            d=num%10;
            reversed1=reversed1*10+d;
            num=num/10;
        }
         while(reversed1!=0)
        {
            d=reversed1%10;
            reversed2=reversed2*10+d;
            reversed1=reversed1/10;
        }
        if(reversed2==n)
        return true;
        else
        return false;
        
    }
}