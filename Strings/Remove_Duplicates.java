public class Remove_Duplicates {

    public static String removeDups(String s) {
        boolean[] encountered = new boolean[26];
        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            int index = c - 'a';
            if (!encountered[index]) {
                encountered[index] = true;
                result.append(c);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "zvvo";
        System.out.println(removeDups(s)); // Output: "zvo"

        s = "gfg";
        System.out.println(removeDups(s)); // Output: "gf"
    }
}
