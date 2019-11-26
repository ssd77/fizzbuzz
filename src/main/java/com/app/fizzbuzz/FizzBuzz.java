package com.app.fizzbuzz;

import static java.util.stream.Collectors.joining;

import java.util.stream.IntStream;

public class FizzBuzz implements Application {
    private static final String fizz  = "Fizz";
    private static final String buzz = "Buzz";
    private static java.util.function.Predicate<Integer> divBy(int n) { return i -> (i % n) == 0;}

    String fizzBuzz(Integer number){
        String showFizz = divBy(3).test(number) ? fizz : "";
        String showBuzz = divBy(5).test(number) ? buzz : "";
        return (showFizz.isEmpty() && showBuzz.isEmpty()) ? number.toString() : showFizz + showBuzz;
    }

    public  String launch(Integer limit) {
        return IntStream.rangeClosed(1, limit).mapToObj(this::fizzBuzz).collect(joining(" "));
    }
}
