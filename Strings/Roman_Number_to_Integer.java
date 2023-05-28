public class Roman_Number_to_Integer {

    public static int romanToDecimal(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int current = symbolValue(s.charAt(i));
            if (i + 1 < s.length()) {
                int next = symbolValue(s.charAt(i + 1));
                if (current < next) {
                    result -= current;
                } else {
                    result += current;
                }
            } else {
                result += current;
            }
        }

        return result;
    }

    public static int symbolValue(char c) {
        switch (c) {
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
                return 0;
        }
    }

    public static void main(String[] args) {
        String s1 = "V";
        System.out.println(romanToDecimal(s1)); // Output: 5

        String s2 = "III";
        System.out.println(romanToDecimal(s2)); // Output: 3
    }
}
