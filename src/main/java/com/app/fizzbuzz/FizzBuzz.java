package com.app.fizzbuzz;

import static java.util.stream.Collectors.joining;

import java.util.Optional;
import java.util.stream.IntStream;

public class FizzBuzz {
    private static final String fizzBuzz = "FizzBuzz";
    private static final String fizz = "Fizz";
    private static final String buzz = "Buzz";

    public static String fizzBuzz(Integer number) {
        return Optional.of(number).map(n -> {
            if (n % 3 == 0 && n % 5 == 0) return fizzBuzz;
            else if (n % 3 == 0) return fizz;
            else if (n % 5 == 0) return buzz;
            else return n.toString();
        }).get();
    }

    static String launch(Integer limit) {
        return IntStream.rangeClosed(1, limit)
                .mapToObj(FizzBuzz::fizzBuzz)
                .collect(joining(" "));
    }
}
