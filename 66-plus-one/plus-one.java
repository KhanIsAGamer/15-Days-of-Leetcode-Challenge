class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1; 
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] digits1 = {1, 2, 3};
        System.out.println(java.util.Arrays.toString(solution.plusOne(digits1))); 


        int[] digits2 = {4, 3, 2, 1};
        System.out.println(java.util.Arrays.toString(solution.plusOne(digits2))); 

        int[] digits3 = {9};
        System.out.println(java.util.Arrays.toString(solution.plusOne(digits3))); 

        int[] digits4 = {9, 9, 9};
        System.out.println(java.util.Arrays.toString(solution.plusOne(digits4))); 
    }
}
