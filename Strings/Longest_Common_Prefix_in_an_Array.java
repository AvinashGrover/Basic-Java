public class Longest_Common_Prefix_in_an_Array {
    static String longestCommonPrefix(String arr[], int n) {
        if (arr == null || arr.length == 0) {
            return "-1";
        }

        String prefix = arr[0];

        for (int i = 1; i < arr.length; i++) {
            String current = arr[i];
            int j = 0;
            while (j < prefix.length() && j < current.length() && prefix.charAt(j) == current.charAt(j)) {
                j++;
            }

            if (j == 0) {
                return "-1";
            }

            prefix = prefix.substring(0, j);
        }

        return prefix;
    }

    public static void main(String[] args) {
        String[] arr1 = { "geeksforgeeks", "geeks", "geek", "geezer" };
        System.out.println(longestCommonPrefix(arr1, 4));

        String[] arr2 = { "hello", "world" };
        System.out.println(longestCommonPrefix(arr2, 2));
    }
}
