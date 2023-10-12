class Solution {
    public boolean isPowerOfTwo(int n) {
        int i;
        boolean val=false;
        for(i=0;i<=31;i++)
        {
            if(n==Math.pow(2,i))
            {
                val=true;
                break;
            }
        }
        return val;

    }
}