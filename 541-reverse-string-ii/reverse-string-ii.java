class Solution {
    public String reverseStr(String s, int k) {
    char[] arr = s.toCharArray();
        int n = arr.length;

        for (int start = 0; start < n; start += 2 * k) {
            int end = Math.min(start + k - 1, n - 1); 
            reverse(arr, start, end);
        }

        return new String(arr);
    }

    private void reverse(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String s1 = "abcdefg";
        int k1 = 2;
        System.out.println(solution.reverseStr(s1, k1)); 

        String s2 = "abcd";
        int k2 = 2;
        System.out.println(solution.reverseStr(s2, k2)); 
    }
}