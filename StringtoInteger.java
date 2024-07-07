class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.length() == 0) {
            return 0;
        }
        int result = 0;
        int sign = 1; 
        
        int i = 0;
        if (s.charAt(0) == '-') {
            sign = -1;
            i = 1;
        } else if (s.charAt(0) == '+') {
            i = 1;
        }
        
        for (; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                break;
            }
            int n = s.charAt(i) - '0';
            
            
            if (result > (Integer.MAX_VALUE - n) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            
            result = result * 10 + n;
        }
        
        result = result * sign;
        
        return result;
    }
}
