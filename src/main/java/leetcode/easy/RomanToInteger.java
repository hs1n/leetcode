package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hsin
 * @see <a href='https://leetcode.com/problems/roman-to-integer/'>13. Roman to Integer</a>
 */
public class RomanToInteger {
    private int convertRomanToInt(char c) {
        switch (c) {
            case ' ':
                return 0;
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                throw new NullPointerException();
        }
    }

    public int romanToInt(String s) {
        int sum = 0;
        int n = s.length();
        String salted = s + " ";

        if (n >= 1 && n <= 15) {

            for (int i = 0; i < n; i++) {
                int thisValue = convertRomanToInt(salted.charAt(i));
                int nextValue = convertRomanToInt(salted.charAt(i + 1));
                if (thisValue >= nextValue) {
                    sum += thisValue;
                } else {
                    sum -= thisValue;
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
        return sum;
    }

    public int romanToIntHashMap(String s) {
        Map<Character, Integer> romanToIntMap = new HashMap<>();
        romanToIntMap.put(' ', 0);
        romanToIntMap.put('I', 1);
        romanToIntMap.put('V', 5);
        romanToIntMap.put('X', 10);
        romanToIntMap.put('L', 50);
        romanToIntMap.put('C', 100);
        romanToIntMap.put('D', 500);
        romanToIntMap.put('M', 1000);

        int sum = 0;
        int n = s.length();
        String salted = s + " ";

        if (n >= 1 && n <= 15) {

            for (int i = 0; i < n; i++) {
                int thisValue = romanToIntMap.get(salted.charAt(i));
                int nextValue = romanToIntMap.get(salted.charAt(i + 1));
                if (thisValue >= nextValue) {
                    sum += thisValue;
                } else {
                    sum -= thisValue;
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
        return sum;
    }
}
