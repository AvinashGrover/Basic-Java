public class Longest_Palindrome_in_a_String {

    public static String longestPalin(String s) {
        int start = 0;
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (isPalindrome(s, i, j)) {
                    int length = j - i + 1;

                    if (length > maxLength) {
                        start = i;
                        maxLength = length;
                    }
                }
            }
        }

        // Return the longest palindromic substring
        return s.substring(start, start + maxLength);
    }

    private static boolean isPalindrome(String s, int start, int end) {
        // Check if the substring is a palindrome
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "aaaabbaa";
        System.out.println("Longest palindromic substring: " + longestPalin(s1));

        String s2 = "abc";
        System.out.println("Longest palindromic substring: " + longestPalin(s2));
    }
}
