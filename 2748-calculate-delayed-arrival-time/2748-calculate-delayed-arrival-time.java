class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int newtime;
        newtime=arrivalTime+delayedTime;
        if(newtime<=23)
        return newtime;
        else
        return (newtime-24);
        
    }
}