Method - 1

class Solution {
    public int reverse(int x) {
        int reversed = 0;
        
        while (x != 0) {
            int pop = x % 10; 
            x /= 10; 
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            
            reversed = reversed * 10 + pop; 
        }
        
        return reversed;
    }
}


Method - 2

class Solution {
    public int reverse(int x) {
        int num = Math.abs(x);
        long reversed = 0;
        int digit;
        while (num > 0) {
            digit = num % 10;
            num = num / 10;
            reversed = reversed * 10 + digit;
        }
         if (reversed > (Integer.MAX_VALUE)){
                return 0; 
            }
        else
        return x < 0 ? (int)-reversed : (int)reversed;
    }
}
	
