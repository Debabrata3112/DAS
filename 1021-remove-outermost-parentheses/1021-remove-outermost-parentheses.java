class Solution {
    public String removeOuterParentheses(String s) {
        int balance = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                balance++;
                if (balance != 1) {
                    sb.append("(");
                }
                
            }
            else if (s.charAt(i) == ')') {
                balance--;
                if (balance != 0) {
                    sb.append(")");
                }
            }
        }
        return sb.toString();
    }
}