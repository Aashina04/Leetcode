class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int i,j,max;
        int n=candies.length;
        boolean x=false;
         List<Boolean> result = new ArrayList<>();
        for(i=0;i<n;i++)
        {
            x=false;
            max=candies[i]+extraCandies;
            for(j=0;j<n;j++)
            {
                if(max>=candies[j])
                x=true;
                else
                {
                    x=false;
                    break;
                }
            }
            result.add(i,x);
        }
        return result;
        
    }
}