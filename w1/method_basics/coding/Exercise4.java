package w1.method_basics.coding;

import java.util.*;

public class Exercise4 {
  
  //add code below this line
public static boolean isPalindrome(String x) {
  for (int i = 0; i < x.length()/2; i++) {
    if (x.charAt(i) != x.charAt(x.length() - i - 1)) {
      return false;
    }
  }
  return true;
}


  //add code above this line
  
  public static void main(String args[]) {
    String x = args[0];
    System.out.println(isPalindrome(x));
  }
  
}