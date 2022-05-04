import java.util.Arrays;

public class FirstMissingPositive {
      public static void main(String[] args) {
            int[] nums = {3, 4, -1, 1};
            System.out.println(firstMissingPositive(nums));
      }

      public static int firstMissingPositive(int[] nums) {
            Arrays.sort(nums);
            int n = 1;
            for (int i = 0; i <nums.length; i++) {
                  if (nums[i] == n) {
                        ++n;
                  }
                  else if (nums[i] > n) {
                        break;
                  }
            }
            return n;
      }
}
