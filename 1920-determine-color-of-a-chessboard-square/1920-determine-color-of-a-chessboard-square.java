class Solution {
    public boolean squareIsWhite(String coordinates) {
        int i,c=coordinates.charAt(1),x=1;
        char ch,ch1=coordinates.charAt(0);
        String s="";
        boolean val=false;
        for(ch='a';ch<='h';ch++)
        {
            if(ch1==ch)
            {
                if(x%2!=0)
                {
                    if(c%2==0)
                    val=true;
                    else
                    val=false;
                }
                else
                {
                    if(c%2!=0)
                    val=true;
                    else
                    val=false;

                }
            }
            
           x=x+1;;
        }
        return val;
        
    }
}