class Solution {
  

    private int robLinear(int[] nums, int start, int end) {
        int prev = 0, curr = 0;
        for (int i = start; i <= end; i++) {
            int temp = curr;
            curr = Math.max(curr, prev + nums[i]);
            prev = temp;
        }
        return curr;
    }

    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return nums[0]; 
        }

        return Math.max(robLinear(nums, 0, n - 2), robLinear(nums, 1, n - 1));
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.rob(new int[]{2, 3, 2})); 
        System.out.println(solution.rob(new int[]{1, 2, 3, 1})); 
        System.out.println(solution.rob(new int[]{1, 2, 3})); 
}

}