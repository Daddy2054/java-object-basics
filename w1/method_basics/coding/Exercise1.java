package w1.method_basics.coding;

import java.util.*;

public class Exercise1 {
  
  //add code below this line

public static double getAvg(double x, double y) {
  return (x + y) / 2;
}

  //add code above this line
  
  public static void main(String args[]) {
    try {
    //   double x = Double.parseDouble(args[0]);
    //   double y = Double.parseDouble(args[1]);
      double x = 10.0;
      double y = 25.0;
      System.out.println(getAvg(x, y));
    }
    catch (Exception e) {
      System.out.println("One or more arguments is not a double or an int.");
    }
  }
  
}