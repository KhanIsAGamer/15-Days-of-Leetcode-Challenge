public class Solution {

    public static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");

        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" ");
            }
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        String s1 = "the sky is blue";
        System.out.println(reverseWords(s1)); 

        String s2 = "  hello world  ";
        System.out.println(reverseWords(s2)); 

        String s3 = "a good   example";
        System.out.println(reverseWords(s3));
    }
}
