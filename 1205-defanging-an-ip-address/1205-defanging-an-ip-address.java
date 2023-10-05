class Solution {
    public String defangIPaddr(String address) {
        int i;
        char ch;
        String s="";
        for(i=0;i<address.length();i++)
        {
            ch=address.charAt(i);
            if(ch=='.')
            s=s+"[.]";
            else
            s=s+ch;

        }
        return s;
        
    }
}