package com.app.fizzbuzz;

import static com.app.fizzbuzz.FizzBuzz.containsDigit;
import static com.app.fizzbuzz.FizzBuzz.fizzBuzz;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;


public class FizzBuzzTest {
    private static final String EXPECTED_OUTPUT = "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz Fizz 14 FizzBuzz 16 17 Fizz 19 Buzz Fizz 22 Fizz Fizz Buzz 26 Fizz 28 29 FizzBuzz Fizz Fizz Fizz Fizz FizzBuzz Fizz Fizz Fizz Fizz Buzz 41 Fizz Fizz 44 FizzBuzz 46 47 Fizz 49 Buzz FizzBuzz Buzz FizzBuzz FizzBuzz Buzz Buzz FizzBuzz Buzz Buzz FizzBuzz 61 62 Fizz 64 Buzz Fizz 67 68 Fizz Buzz 71 Fizz Fizz 74 FizzBuzz 76 77 Fizz 79 Buzz Fizz 82 Fizz Fizz Buzz 86 Fizz 88 89 FizzBuzz 91 92 Fizz 94 Buzz Fizz 97 98 Fizz Buzz";

    @Test
    public void multiplesOf3_shouldReturnFizz() {
        assertThat(fizzBuzz(9), is("Fizz"));
        assertThat(fizzBuzz(12), is("Fizz"));
        assertThat(fizzBuzz(18), is("Fizz"));
        assertThat(fizzBuzz(99), is("Fizz"));
    }

    @Test
    public void multiplesOf5_shouldReturnBuzz() {
        assertThat(fizzBuzz(5), is("Buzz"));
        assertThat(fizzBuzz(10), is("Buzz"));
        assertThat(fizzBuzz(20), is("Buzz"));
        assertThat(fizzBuzz(100), is("Buzz"));
    }

    @Test
    public void multiplesOf3and5_shouldReturnFizzBuzz() {
        assertThat(fizzBuzz(15), is("FizzBuzz"));
        assertThat(fizzBuzz(45), is("FizzBuzz"));
        assertThat(fizzBuzz(60), is("FizzBuzz"));
        assertThat(fizzBuzz(75), is("FizzBuzz"));
    }

    @Test
    public void divisibleBy3OrContains3AndDivisibleBy5OrContains5() {
        assertThat(fizzBuzz(35), is("FizzBuzz"));
        assertThat(fizzBuzz(53), is("FizzBuzz"));
        assertThat(fizzBuzz(51), is("FizzBuzz"));
    }

    @Test
    public void numberWithDigit3_shouldReturnFizz() {
        assertThat(fizzBuzz(3), is("Fizz"));
        assertThat(fizzBuzz(13), is("Fizz"));
        assertThat(fizzBuzz(63), is("Fizz"));
        assertThat(fizzBuzz(93), is("Fizz"));
    }

    @Test
    public void numberWithDigit5_shouldReturnBuzz() {
        assertThat(fizzBuzz(5), is("Buzz"));
        assertThat(fizzBuzz(59), is("Buzz"));
        assertThat(fizzBuzz(55), is("Buzz"));
        assertThat(fizzBuzz(95), is("Buzz"));
    }

    @Test
    public void containsDigitTest() {
        assertThat(containsDigit(13,3),is(true));
        assertThat(containsDigit(15,5),is(true));
        assertThat(containsDigit(555678,3),is(false));
        assertThat(containsDigit(987456,3),is(false));
    }

    @Test
    public void realFizzBuzz_shouldReturnExpectedOutput() {
        assertThat(FizzBuzz.launch(100), is(EXPECTED_OUTPUT));
    }

}
