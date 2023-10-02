class Solution {
    public int mostWordsFound(String[] sentences) {
        int i,j,count=0,word=0;
        char c;
        String s="";
        for(i=0;i<sentences.length;i++)
        {
            count=0;
            s=sentences[i];
            s=s.trim();
            for(j=0;j<s.length();j++)
            {
                c=s.charAt(j);
                if(c==' ')
                count++;

            }
            if(count+1>word)
            word=count+1;

        }
        return word;
        
    }
}