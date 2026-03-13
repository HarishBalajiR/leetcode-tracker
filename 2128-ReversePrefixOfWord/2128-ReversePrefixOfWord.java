// Last updated: 3/13/2026, 8:16:25 PM
class Solution {
    public String reversePrefix(String word, char ch) {
        for (int index = 0; index < word.length(); index++) {
            if (word.charAt(index) == ch) {
                String substring = word.substring(0,index+1);
                StringBuilder sb = new StringBuilder(substring);
                return sb.reverse().toString() + word.substring(index+1,word.length());
            }
        }
        return word;
    }
}