package w2.recursion;

public class WhatIsRecursion {
    public static void main(String args[]) {
      
      //add code below this line
  
      System.out.println(factorial(5)); 
  
      //add code above this line
    }
    
    //add method definitions below this line
    
    /**
    * @param integer n
    * @return factorial of n, integer
    */
    public static int factorial(int n) {
      if (n == 1) {
        return 1;
      } else {
        return n * factorial(n - 1);
      }
    }
    //add method definitions above this line
  
  }
