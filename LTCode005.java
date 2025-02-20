import java.util.HashMap;

class LTCode005 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        
        return new int[] {}; // No solution found
    }

    public static void main(String[] args) {
        LTCode005 solution = new LTCode005();
        
        // Example inputs
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // Call twoSum method
        int[] result = solution.twoSum(nums, target);

        // Print the result
        if (result.length == 2) {
            System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No solution found.");
        }
    }
}
