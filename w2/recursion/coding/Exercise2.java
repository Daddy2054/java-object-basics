package w2.recursion.coding;

import java.util.Arrays;

public class Exercise2 {
    public static void main(String[] args) {

        // call recursive method below this line
        int[] y = { 1, 2, 3, 4, 5 };

        System.out.println(listSum(y));

        // call recursive method above this line
    }

    // add method definitions below this line
   //add method definitions below this line
  
   public static int listSum(int[] nums) {
    if (nums.length == 1) {
      return nums[0];
    } else {
      int lastIndex = nums.length;
      int tail[] = Arrays.copyOfRange(nums, 1, lastIndex);
      return nums[0] + listSum(tail);
    }
  }
  
  //add method definitions above this line

    // add method definitions above this line
}
