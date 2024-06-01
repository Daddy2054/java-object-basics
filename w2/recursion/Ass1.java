package w2.recursion;

public class Ass1 {
    public static void main(String[] args) {

        // add code below this line

        System.out.println(findSum(3));

        // add code above this line
    }

    public static int findSum(int n) {
        if (n == 0) {
            return 0;
        } else {
            return (n + findSum(n - 1));
        }
    }

}
