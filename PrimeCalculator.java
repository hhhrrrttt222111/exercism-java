public class PrimeCalculator {

    public int nth(int n) {
        if (n < 1)
            throw new IllegalArgumentException();

        int num = 2;
        int c = 1;

        while (c < n) {
            num++;
            boolean prime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }
            if (!prime)
                continue;
            c++;
        }
        return num;
    }
}