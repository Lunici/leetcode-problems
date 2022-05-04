import java.util.ArrayList;

public class PalindromeNumber {
      public static void main(String[] args) {
            System.out.println(isPalindrome(12321));
      }

      public static boolean isPalindrome(int x) {
            if (x >= 0) {
                  ArrayList<Integer> array_x = new ArrayList<Integer>();
                  int x_copy = x;
                  while (x_copy != 0) {
                        array_x.add(x_copy % 10);
                        x_copy /= 10;
                  }
                  for (int i = 0; i < array_x.size() / 2; i++) {
                        if (array_x.get(i) != array_x.get(array_x.size() - i - 1)){
                              return false;
                        }
                  }
                  return true;
            }
            else {
                  return false;
            }
      }
}