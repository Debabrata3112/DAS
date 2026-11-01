class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }
        String combine=s+s;
        if(combine.contains(goal)){
            return true;
        }
        return false;
    }
}