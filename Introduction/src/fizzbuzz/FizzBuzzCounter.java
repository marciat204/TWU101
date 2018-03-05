package fizzbuzz;

import java.util.LinkedList;
import java.util.List;

public class FizzBuzzCounter {
    public String print(int numbers) {
        List<String> printedNumbersBuffer = new LinkedList<>();

        for (int i = 1; i <= numbers; i++) {
            String currentNumber = "";
            if (i % 3 == 0 || i % 5 == 0){
                if (i % 3 == 0){
                    currentNumber = currentNumber.concat("Fizz");
                }
                if (i % 5 == 0) {
                    currentNumber = currentNumber.concat("Buzz");
                }
            }
            else {
                currentNumber = "" + i;
            }
            printedNumbersBuffer.add(currentNumber);
        }
        String printedNumbers = String.join("\n", printedNumbersBuffer);
        return printedNumbers;
    }
}
