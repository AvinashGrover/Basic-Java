
class Running_Sum {
    public int[] runningSum(int[] nums) {
        int size = nums.length;
        int sum = 0;
        int[] store_running_sum = new int[size]; // Create an array to store the running sum

        for (int i = 0; i < size; i++) {
            sum = sum + nums[i];
            store_running_sum[i] = sum; // Store the running sum value at the index i
        }

        return store_running_sum; // Return the array containing running sum values
    }

    public static void main(String[] args) {
        Running_Sum running = new Running_Sum();
        int[] nums = { 1, 2, 3, 4 };

        int[] runningSumArray = running.runningSum(nums);

        for (int num : runningSumArray) {
            System.out.print(num + " ");
        }
    }

}