package com.app.fizzbuzz;

import static java.util.stream.Collectors.joining;

import java.util.Optional;
import java.util.function.Function;
import java.util.stream.IntStream;

public class FizzBuzz {
    private static final String fizzBuzz = "FizzBuzz";
    private static final String fizz = "Fizz";
    private static final String buzz = "Buzz";
    private static final Function<Integer,Boolean> divisibleByThree = x -> x % 3 == 0;
    private static final Function<Integer,Boolean> divisibleByFive = x -> x % 5 == 0;

    public static String fizzBuzz(Integer number) {
        return Optional.of(number).map(n -> {
            if ((divisibleByThree.apply(n) || containsDigit(n,3)) &&
                    (divisibleByFive.apply(n) || containsDigit(n,5))) return fizzBuzz;
            else if (divisibleByThree.apply(n) || containsDigit(n,3)) return fizz;
            else if (divisibleByFive.apply(n) || containsDigit(n,5)) return buzz;
            else return n.toString();
        }).get();
    }

    static boolean containsDigit(int number, int digit) {
        int maxIterations = String.valueOf(number).length();
        return IntStream.iterate(number, n -> n / 10).limit(maxIterations)
                .anyMatch(n1 -> n1 % 10 == digit);
    }

    static String launch(Integer limit) {
        return IntStream.rangeClosed(1, limit)
                .mapToObj(FizzBuzz::fizzBuzz)
                .collect(joining(" "));
    }
}
