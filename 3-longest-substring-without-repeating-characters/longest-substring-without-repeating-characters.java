import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0; 
        int left = 0; 
        HashSet<Character> set = new HashSet<>(); 

        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String s1 = "abcabcbb";
        System.out.println(solution.lengthOfLongestSubstring(s1)); 

        String s2 = "bbbbb";
        System.out.println(solution.lengthOfLongestSubstring(s2)); 

        String s3 = "pwwkew";
        System.out.println(solution.lengthOfLongestSubstring(s3)); 
    }
}
