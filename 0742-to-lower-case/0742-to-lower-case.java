class Solution {
    public String toLowerCase(String s) {
        int i;
        char ch;
        String st="";
        for(i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            ch=Character.toLowerCase(ch);
            st=st+ch;
        }
        return st;
        
    }
}