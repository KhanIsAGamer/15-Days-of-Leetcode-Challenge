class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        int index = s.length() - 1;

        while (index >= 0 && s.charAt(index) == ' ') {
            index--;
        }

        while (index >= 0 && s.charAt(index) != ' ') {
            length++;
            index--;
        }

        return length;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String s1 = "Hello World";
        System.out.println(solution.lengthOfLastWord(s1)); 

        String s2 = "   fly me   to   the moon  ";
        System.out.println(solution.lengthOfLastWord(s2)); 

        String s3 = "luffy is still joyboy";
        System.out.println(solution.lengthOfLastWord(s3)); 
    }
}
