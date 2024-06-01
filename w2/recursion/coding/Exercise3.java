package w2.recursion.coding;

public class Exercise3 {
    public static void main(String[] args) {
        System.out.println(bunnyEars(10));
    }

    public static int bunnyEars(int bunnies) {
        if (bunnies == 0) {
            return 0;
        }
        return 2 + bunnyEars(bunnies - 1);
    }
}
