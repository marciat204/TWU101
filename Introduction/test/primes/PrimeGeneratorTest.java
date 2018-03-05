package primes;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class PrimeGeneratorTest {

    @Test
    public void ShouldGenerateThreePrime(){
        PrimeGenerator primeGenerator = new PrimeGenerator();
        List<String> printedNumbers = primeGenerator.generate(30);
        assertEquals(3, printedNumbers.size());
        assertEquals(printedNumbers.get(0), "2");
        assertEquals(printedNumbers.get(1), "3");
        assertEquals(printedNumbers.get(2), "5");
    }

}