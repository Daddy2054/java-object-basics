package w2.recursion;

import java.util.*;

public class Fibonaccihash {
  public static void main(String[] args) {

    //add code below this line
    Map<Integer, Long> fibCache = new HashMap<>(); 
    int fibonacciLength = 90;
    for (int num = 0; num < fibonacciLength; num++) {
      System.out.println(fibonacci(num, fibCache));
    }
    //add code above this line
  }

  //add method definitions below this line
  public static long fibonacci(int n, Map<Integer, Long> h) {
    if (!h.containsKey(n)) {
      h.put(n, calculateFib(n, h));
    }
    return h.get(n);
  }

  public static long calculateFib(int n, Map<Integer, Long> h) {
    if (n <= 1) {
      return n;
    } else {
      return fibonacci(n-1, h) + fibonacci(n-2, h);
    }
  }
  //add method definitions above this line
}