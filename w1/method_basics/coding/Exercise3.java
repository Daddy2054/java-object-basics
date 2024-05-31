package w1.method_basics.coding;

import java.util.*;

public class Exercise3 {
  
  //add code below this line
public static boolean findTerm(String x, ArrayList<String> y) {
  if (y.contains(x)) {
    return true;
  } else {
    return false;
  }
}

//sample solution
// public static boolean findTerm(String x, ArrayList<String> y) {
//     boolean b = false;
//     for (String S : y) {
//       if (S.equals(x)) {
//         b = true;
//       }
//     }
//     return b;
//   }

  //add code above this line
  
  public static void main(String args[]) {
    String x = args[0];
    ArrayList<String> y = new ArrayList<String>();
    for (int i = 1; i < args.length; i++) {
      y.add(args[i]);
    }
    System.out.println(findTerm(x, y));
  }
  
}