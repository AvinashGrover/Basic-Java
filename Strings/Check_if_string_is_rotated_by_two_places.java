public class Check_if_string_is_rotated_by_two_places {

    public static boolean isRotated(String a, String b) {
        int n = a.length();

        if (n != b.length()) {
            return false;
        }

        // Anticlockwise rotation
        String anticlockwise = a.substring(2) + a.substring(0, 2);
        if (anticlockwise.equals(b)) {
            return true;
        }

        String clockwise = a.substring(n - 2) + a.substring(0, n - 2);
        if (clockwise.equals(b)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        String a = "amazon";
        String b = "azonam";
        System.out.println(isRotated(a, b)); // Output: true

        a = "geeksforgeeks";
        b = "geeksgeeksfor";
        System.out.println(isRotated(a, b)); // Output: false
    }
}
