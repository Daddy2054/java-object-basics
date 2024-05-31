package w1.method_basics.coding;

import java.util.*;

public class Exercise2 {

    // add code below this line

    public static void getOddsEvens(boolean x, ArrayList<Integer> y) {
        if (x) {
            for (int i = 0; i < y.size(); i++) {
                if (y.get(i) % 2 == 0) {
                    System.out.println(y.get(i));
                }
            }
        } else {
            for (int i = 0; i < y.size(); i++) {
                if (y.get(i) % 2 != 0) {
                    System.out.println(y.get(i));
                }
            }
        }
    }

    // sample solution
    // public static void getOddsEvens(boolean x, ArrayList<Integer> y) {
    //     if (x == true) {
    //       for (Integer I1: y) {
    //         if (I1 % 2 == 0) {
    //           System.out.println(I1);
    //         }
    //       }
    //     }
    //     if (x == false) {
    //       for (Integer I2: y) {
    //         if (I2 % 2 == 1) {
    //           System.out.println(I2);
    //         }
    //       }
    //     }
    //   }
    // add code above this line

    public static void main(String args[]) {
        // boolean x = false;
        boolean x = Boolean.parseBoolean(args[0]);
        ArrayList<Integer> y = new ArrayList<Integer>();
        for (int i = 1; i < args.length; i++) {
            y.add(Integer.parseInt(args[i]));
        }
        getOddsEvens(x, y);
    }

}