class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int i,c=0;
        for(i=0;i<hours.length;i++)
        {
            if(hours[i]>=target)
            c++;
        }
        return c;
        
    }
}