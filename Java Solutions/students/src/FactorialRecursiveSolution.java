public class FactorialRecursiveSolution {

    public int factorials(int n) {
        if (n <= 1) {
            System.out.println("less or equal to 1");
        }
        else {
            return n *  factorials(n-1);
        }

        return 0;
    }
    public static void main(String[] args) {
        FactorialRecursiveSolution getAnswer = new FactorialRecursiveSolution();
        getAnswer.factorials(5);
    }
}
