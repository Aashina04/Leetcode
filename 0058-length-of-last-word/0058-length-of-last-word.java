class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        String w="";
        int x=s.lastIndexOf(" ");
        w=s.substring(x+1);
        int len=w.length();
        return len;
        
    }
}