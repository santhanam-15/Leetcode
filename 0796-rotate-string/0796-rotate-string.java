class Solution {
    public boolean rotateString(String s, String goal) {
        int l= s.length();
        if(l!=goal.length()){
            return false;
        }
        s+=s;
        return s.contains(goal);
    }
}