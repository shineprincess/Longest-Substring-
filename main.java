import java.util.*;

public class Main {
  public static void main(String[] args) {
    Solution s = new Solution();
    
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();

    int max = s.lengthOfLongestSubstring(str);
    
    System.out.println("Max Length " + max);
  }
}

class Solution {
    public int lengthOfLongestSubstring(String s) {
      HashSet<Character> hSet = new HashSet<Character>();

      int i=0;
      int left_pointer=0;
      int maxLen=0;

      while(i<s.length()) {
        if(!hSet.contains(s.charAt(i))){
          hSet.add(s.charAt(i));
          maxLen = Math.max(hSet.size(),maxLen);
          i++;
        }else{
          hSet.remove(s.charAt(left_pointer));
          left_pointer++;
        }
      }

      return maxLen;
    }
}
