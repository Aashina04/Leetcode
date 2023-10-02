class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int n1=word1.length;
        int n2=word2.length;
        int i,j;
        String s1="";
        String s2="";
        for(i=0;i<n1;i++)
        {
            s1+=word1[i];
        }
        for(j=0;j<n2;j++)
        {
            s2+=word2[j];
        }
        if(s1.equalsIgnoreCase(s2))
        return true;
        else
        return false;

        
    }
}