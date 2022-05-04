
class Solution {
      public static int lengthOfLongestSubstring(String s) {
            int left = 0;
            int right = 0;
            int result = 0;
            int[] chars = new int[128];
            while(right < s.length()){
                char c = s.charAt(right);
                if(chars[c] > 0) {
                    left = Math.max(left, chars[c]);
                }
                result = Math.max(result, right - left + 1);
                chars[c] = ++right;
            }
            return result;
        }
        

      public static void main(String[] args) {
            System.out.println(lengthOfLongestSubstring("abcabcbb"));
      }
}