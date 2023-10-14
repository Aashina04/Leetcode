class Solution {
    public String reverseWords(String s) {
        s=s+" ";
        int i,n=s.length();
        char ch;
        String s1="",w="";
        for(i=0;i<n;i++)
        {
            ch=s.charAt(i);
            if(ch!=' ')
            w=ch+w;
            else
            {
                s1=s1+w+" ";
                w="";
            }
        }
        s1=s1.trim();
        return s1;
    }
}