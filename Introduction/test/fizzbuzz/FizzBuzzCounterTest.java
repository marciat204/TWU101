package fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzCounterTest {

    @Test
    public void ShouldPrint15NumbersFizzBuzz(){
        FizzBuzzCounter fizzBuzzCounter = new FizzBuzzCounter();
        assertEquals("1\n" +
                "2\n" +
                "Fizz\n" +
                "4\n" +
                "Buzz\n" +
                "Fizz\n" +
                "7\n" +
                "8\n" +
                "Fizz\n" +
                "Buzz\n" +
                "11\n" +
                "Fizz\n" +
                "13\n" +
                "14\n" +
                "FizzBuzz", fizzBuzzCounter.print(15));
    }
}