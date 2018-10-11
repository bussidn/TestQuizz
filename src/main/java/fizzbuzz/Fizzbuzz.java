package fizzbuzz;

import java.util.stream.Stream;

public class Fizzbuzz {
    public String fizzbuzz(int input) {

        if (input%5==0)
            return "buzz";

        if (input%3==0)
            return "fizz";

        return String.valueOf(input);
    }

    public String[] fizzbuzz(Integer[] input) {
        return Stream.of(input)
                .map(this::fizzbuzz)
                .toArray(String[]::new);
    }
}
