package primes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeGenerator {

    public List<String> generate(int numbers) {
        List<String> primesFactor = new ArrayList<>();
        int iterations = numbers;

        for (int i = 2; i <= iterations / i; i++) {
            while (iterations % i == 0) {
                primesFactor.add(Integer.toString(i));
                iterations /= i;
            }
        }
        if (iterations > 1) {
            primesFactor.add(Integer.toString(iterations));
        }

        return primesFactor;
    }
}
