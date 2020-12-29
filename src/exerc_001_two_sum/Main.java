package exerc_001_two_sum;

public class Main {
    //https://leetcode.com/problems/two-sum/
    public static void main(String[] args) {
        int[] nums = new int[]{-1, -2, -3, -4, -5};
        int target = -8;
        int[] sol = Solution.twoSum(nums, target);
        for (int i = 0; i < sol.length; i++) {
            System.out.println("Element at index " + i + " : " + sol[i]);
        }
    }
}
