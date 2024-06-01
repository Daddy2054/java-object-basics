package w2.recursion;

public class Fibonacci {
    public static void main(String[] args) {
      
      //add code below this line
  
      System.out.println(fibonacci(3));
  
      //add code above this line
    }
    
    //add method definitions below this line
    
    /**
    * @param integer n
    * @return Fibonacci number of n, integer
    */
    public static int fibonacci(int n) {
      if (n <= 1) {
        return n;
      } else {
        return(fibonacci(n-1) + fibonacci(n-2));
      }
    }
    
    //add method definitions above this line
  
  }
