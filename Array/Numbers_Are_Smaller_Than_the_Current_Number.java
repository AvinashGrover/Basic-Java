import java.util.Arrays;

class Numbers_Are_Smaller_Than_the_Current_Number {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = new int[101];

        // Count the occurrences of each number
        for (int num : nums) {
            count[num]++;
        }

        // Calculate the count of smaller numbers for each element
        for (int i = 1; i <= 100; i++) {
            count[i] += count[i - 1];
        }

        // Calculate the result using the count array
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = (nums[i] == 0) ? 0 : count[nums[i] - 1];
        }

        return result;
    }

    public static void main(String[] args) {
        Numbers_Are_Smaller_Than_the_Current_Number Number = new Numbers_Are_Smaller_Than_the_Current_Number();

        int[] nums1 = { 8, 1, 2, 2, 3 };
        int[] output1 = Number.smallerNumbersThanCurrent(nums1);
        System.out.println(Arrays.toString(output1)); // Output: [4, 0, 1, 1, 3]

        int[] nums2 = { 6, 5, 4, 8 };
        int[] output2 = Number.smallerNumbersThanCurrent(nums2);
        System.out.println(Arrays.toString(output2)); // Output: [2, 1, 0, 3]

        int[] nums3 = { 7, 7, 7, 7 };
        int[] output3 = Number.smallerNumbersThanCurrent(nums3);
        System.out.println(Arrays.toString(output3)); // Output: [0, 0, 0, 0]
    }
}
