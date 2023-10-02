class Solution {
    public String restoreString(String s, int[] indices) {
        int n=s.length();
        char a[]=new char[n];
        String st="";
        int i,j,p;
        char ch;
        for(i=0;i<n;i++)
        {
            ch=s.charAt(i);
            p=indices[i];
            a[p]=ch;

        }
        for(j=0;j<n;j++)
        {
            st=st+a[j];

        }
        return st;
        
        
    }
}