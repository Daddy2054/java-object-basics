package w2.recursion.coding;

import java.util.Arrays;

public class Exercise5 {
    public static void main(String[] args) {
        int[] y = { 1, 2, 3, 4, 5, 13, 22, 7 };

        System.out.println(getMax(y));
    }

    // Return the largest integer in the array.
     //add method definitions below this line
  
  public static int getMax (int[] nums) {
    if (nums.length == 1) {
      return nums[0];
    } else {
      int lastIndex = nums.length;
      int tail[] = Arrays.copyOfRange(nums, 1, lastIndex);
      return Math.max(nums[0], getMax(tail));
    }
  }
  
  //add method definitions above this line
}
