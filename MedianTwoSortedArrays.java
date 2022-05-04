public class MedianTwoSortedArrays {
      public static void main(String[] args) {
            int[] n1 = {1,2};
            int[] n2 = {3, 4}; 
            System.out.println(findMedianSortedArrays(n1, n2));
      }

      public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
            float mid = (nums1.length + nums2.length) / (float)2 + 1;
            int a = 0;
            int b = 0;
            int m = nums1.length;
            int n = nums2.length;
            int left = 0;
            int right = 0;

            for (int i = 0; i <= mid; ++i) {
                  if (a == m) {
                        if (i == (int)mid - 2) {
                              left = nums2[b];
                        }
                        else if (i == (int)mid - 1) {
                              right = nums2[b];
                        }
                        ++b;
                  }
                  else if (b == n) {
                        if (i == (int)mid - 2) {
                              left = nums1[a];
                        }
                        else if (i == (int)mid - 1) {
                              right = nums1[a];
                        }
                        ++a;
                  }

                  else if (nums1[a] <= nums2[b]) {
                        if (i == (int)mid - 2) {
                              left = nums1[a];
                        }
                        else if (i == (int)mid - 1) {
                              right = nums1[a];
                        }
                        ++a;
                  }
                  else {
                        if (i == (int)mid - 2) {
                              left = nums2[b];
                        }
                        else if (i == (int)mid - 1) {
                              right = nums2[b];
                        }
                        ++b;
                  }
            }

            // par
            if (mid == (int)mid) {
                  return (left + right) / (double)2;
            }
            // no par
            else {
                  return (double)right;
            }
      }
  }
