package A00278612;

public class FibonacciGenerator {
    private int a;
    private int b;

    public FibonacciGenerator() {
    }

    public int CalculateFibonacciSequence(int n){
        int a = 0, b = 1, c;
        if (n == 0)
            return a;
        for (int i = 2; i <= n; i++) {
        c = a + b;
        a = b;
        b = c;
    }
    return b;
    }
}

