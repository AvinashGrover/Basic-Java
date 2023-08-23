import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Subarray_with_given_sum {
    public ArrayList<Integer> subarraySum(int[] arr, int N, int S) {
        ArrayList<Integer> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        int currentSum = 0;

        for (int i = 0; i < N; i++) {
            currentSum += arr[i];

            if (currentSum == S) {
                result.add(1);
                result.add(i + 1);
                return result;
            }

            if (map.containsKey(currentSum - S)) {
                result.add(map.get(currentSum - S) + 1);
                result.add(i + 1);
                return result;
            }

            map.put(currentSum, i + 1);
        }

        result.add(-1);
        return result;
    }

    public static void main(String[] args) {
        Subarray_with_given_sum Subarray = new Subarray_with_given_sum();

        int[] arr1 = { 1, 2, 3, 7, 5 };
        int N1 = 5;
        int S1 = 12;
        ArrayList<Integer> result1 = Subarray.subarraySum(arr1, N1, S1);
        System.out.println(result1); // Output: [2, 4]

        int[] arr2 = { 1, 3, 2, 1 };
        int N2 = 4;
        int S2 = 15;
        ArrayList<Integer> result2 = Subarray.subarraySum(arr2, N2, S2);
        System.out.println(result2); // Output: [1, 5]
    }
}
