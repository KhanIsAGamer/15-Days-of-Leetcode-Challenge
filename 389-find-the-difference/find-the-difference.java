class Solution {
   public static char findTheDifference(String s, String t) {
        char result = 0;

        for (char c : s.toCharArray()) {
            result ^= c;
        }
        for (char c : t.toCharArray()) {
            result ^= c;
        }

        return result;
    }

    public static void main(String[] args) {
        String s1 = "abcd";
        String t1 = "abcde";
        System.out.println(findTheDifference(s1, t1)); 

        String s2 = "";
        String t2 = "y";
        System.out.println(findTheDifference(s2, t2)); 
    }
}
