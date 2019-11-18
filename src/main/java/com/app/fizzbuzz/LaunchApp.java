package com.app.fizzbuzz;

import static com.app.fizzbuzz.FizzBuzz.launch;

public class LaunchApp {
    public static void main( String[] args ) {
        System.out.println( "The FizzBuzz Application" );
        final String fizzBuzzOutput = launch(100);
        System.out.println(fizzBuzzOutput);
    }
}
