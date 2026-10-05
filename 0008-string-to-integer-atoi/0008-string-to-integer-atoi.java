class Solution {
    public int myAtoi(String s) {
        int n = s.length();
        int i = 0;
        long number = 0;

        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        int sign = 1;
        if (i < n && s.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (i < n && s.charAt(i) == '+') {
            i++;
        }

        int limit;
        if (sign == -1) {
            limit = 8;
        } else {
            limit = 7;
        }

        while (i < n && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            int digit = s.charAt(i) - '0';
            if (number > Integer.MAX_VALUE / 10 || number == Integer.MAX_VALUE / 10 && digit > limit) {
                if (sign == 1) {
                    return Integer.MAX_VALUE;
                } else {
                    return Integer.MIN_VALUE;
                }
            }
            number = number * 10 + digit;
            i++;
        }

        return (int)number * sign;
    }
}