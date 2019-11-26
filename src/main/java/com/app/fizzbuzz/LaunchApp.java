package com.app.fizzbuzz;

public class LaunchApp {
    public static void main( String[] args ) {
        Application fizzBuzz = new FizzBuzz();
        System.out.println(fizzBuzz.launch(100));
    }
}
