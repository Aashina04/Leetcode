class Solution {
    public boolean isPalindrome(int x) {
      if(x<0)
      return false;
      else{
        int num=x;
        int r,s=0;
        while(x!=0)
        {
          r=x%10;
          s=s*10+r;
          x=x/10;
        }
        if(s==num)
        return true;
        else
        return false;
      }
        
    }
}