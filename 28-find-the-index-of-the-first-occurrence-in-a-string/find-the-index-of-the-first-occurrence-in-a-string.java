class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0; 
        if (haystack.length() < needle.length()) return -1; 

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String haystack1 = "sadbutsad";
        String needle1 = "sad";
        System.out.println(solution.strStr(haystack1, needle1)); 

        String haystack2 = "leetcode";
        String needle2 = "leeto";
        System.out.println(solution.strStr(haystack2, needle2)); 
    }
}
