import java.util.HashMap;
import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> romanToValue = new HashMap<>();
        romanToValue.put('I', 1);
        romanToValue.put('V', 5);
        romanToValue.put('X', 10);
        romanToValue.put('L', 50);
        romanToValue.put('C', 100);
        romanToValue.put('D', 500);
        romanToValue.put('M', 1000);

        int total = 0;
        int length = s.length();

        for(int i=0; i<length; i++){
            int currentValue = romanToValue.get(s.charAt(i));
            if(i < length -1 && currentValue < romanToValue.get(s.charAt(i + 1))){
                total -= currentValue;
            }else{
                total += currentValue;
            }
        }

        return total;
    }
}
