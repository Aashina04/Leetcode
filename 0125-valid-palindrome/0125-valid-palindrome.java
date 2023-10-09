class Solution {
    public boolean isPalindrome(String s) {
        int i;
        char ch;
        String s1="",s2="";
        for(i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            if(Character.isLetter(ch)||Character.isDigit(ch))
            {
                ch=Character.toLowerCase(ch);
                s1=s1+ch;
                s2=ch+s2;
            }
        }
        if(s1.equals(s2))
        return true;
        else
        return false;
        
    }
}