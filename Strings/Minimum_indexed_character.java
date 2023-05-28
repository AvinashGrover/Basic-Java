public class Minimum_indexed_character {

    public static int minIndexChar(String str, String patt) {
        int[] freq = new int[26];

        for (int i = 0; i < patt.length(); i++) {
            char c = patt.charAt(i);
            freq[c - 'a']++;
        }

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (freq[c - 'a'] > 0) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String str1 = "geeksforgeeks";
        String patt1 = "set";
        System.out.println(minIndexChar(str1, patt1));

        String str2 = "adcffaet";
        String patt2 = "onkl";
        System.out.println(minIndexChar(str2, patt2));
    }
}
