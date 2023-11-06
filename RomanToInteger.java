// Enter a Roman Number as input and convert it to an integer. (ex IX = 9)

public class RomanToInteger {
    public static void main(String[] args) {
        String romanNumeral = "IX";
        int result = romanToInt(romanNumeral);
        System.out.println(result);
    }

    public static int romanToInt(String s) {
        int[] values = new int[26];
        values['I' - 'A'] = 1;
        values['V' - 'A'] = 5;
        values['X' - 'A'] = 10;
        values['L' - 'A'] = 50;
        values['C' - 'A'] = 100;
        values['D' - 'A'] = 500;
        values['M' - 'A'] = 1000;

        int result = 0;
        int prevValue = 0;

        for (char c : s.toCharArray()) {
            int value = values[c - 'A'];
            result += (value > prevValue) ? (value - 2 * prevValue) : value;
            prevValue = value;
        }
        
        return result;
    }
}
