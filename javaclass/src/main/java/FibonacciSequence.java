public class FibonacciSequence {
    public static void main(String[] args) {

        int first = 0;
        int second = 1;

        for (int i = 0; i < 15; i++) {
            System.out.println(first);

            int next = first + second;
            first = second;
            second = next;
        }
    }
}

