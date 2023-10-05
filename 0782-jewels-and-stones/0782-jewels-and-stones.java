class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int i,j,count=0;
        char ch;
        for(i=0;i<jewels.length();i++)
        {
            ch=jewels.charAt(i);
            for(j=0;j<stones.length();j++)
            {
                if(stones.charAt(j)==ch)
                count++;
            }

        }
        return count;
        
    }
}