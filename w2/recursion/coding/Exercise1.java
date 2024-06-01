package w2.recursion.coding;

public class Exercise1 {
    public static void main(String[] args) {

        // call recursive method below this line

        System.out.println(recursiveSum(10));

        // call recursive method above this line
    }

    // add method definitions below this line
    public static int recursiveSum(int num) {
        if (num < 0) {
            return 0;
        } else {
            return num + recursiveSum(num - 1);
        }
    }

    // add method definitions above this line
}
