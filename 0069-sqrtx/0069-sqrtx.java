class Solution {
    public int mySqrt(int x) {
        for(int i=0;true;i++)if(i*i>x||i*i<0)return i-1;
    }
}