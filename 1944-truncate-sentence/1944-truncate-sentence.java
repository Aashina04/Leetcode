class Solution {
    public String truncateSentence(String s, int k) {
        s=s.trim();
        s=s+" ";
        String st="";
        int i,index=0,c=0;
        int word;
        char ch;
        for(i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            if(ch==' ')
            c++;
            if(c==k)
            {
                index=i;
                break;
            }

        }
        st=s.substring(0,index);
        return st;
    
        
    }
}