class Solution {
public void sortColors(int[] nums){
        int red = 0, white = 0, blue = nums.length - 1;
        while (white <= blue) {
            if (nums[white] == 0) {
                swap(nums, white, red);
                red++;
                white++;
            } else if (nums[white] == 1) {
                white++;
            } else {
                swap(nums, white, blue);
                blue--;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        Solution solution = new Solution ();

        int[] nums1 = {2, 0, 2, 1, 1, 0};
        solution.sortColors(nums1);
        System.out.println(java.util.Arrays.toString(nums1)); 

        int[] nums2 = {2, 0, 1};
        solution.sortColors(nums2);
        System.out.println(java.util.Arrays.toString(nums2)); 

}
   
}