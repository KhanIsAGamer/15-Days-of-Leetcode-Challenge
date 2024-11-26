import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
       
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1; 
            if (nums[index] > 0) {
                nums[index] = -nums[index]; 
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1); 
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(solution.findDisappearedNumbers(nums1)); 

        int[] nums2 = {1, 1};
        System.out.println(solution.findDisappearedNumbers(nums2)); 
    }
}
