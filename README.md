
# The FizzBuzz 


## Stage - 1
* A number is `Fizz` if it is divisible by `3`
* A number is `Buzz` if it is divisible by `5`
* A number is `FizBuzz` if it is divisible by `3` and `5`

### Example Stage - 1

Note: Please look at the first commit to see following output

Running the program over a range from 1 - 100  one should get the following output:
```
1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz 16 17 Fizz 19 Buzz Fizz 22 23 Fizz Buzz 26 Fizz 28 29 FizzBuzz 31 32 Fizz 34 Buzz Fizz 37 38 Fizz Buzz 41 Fizz 43 44 FizzBuzz 46 47 Fizz 49 Buzz Fizz 52 53 Fizz Buzz 56 Fizz 58 59 FizzBuzz 61 62 Fizz 64 Buzz Fizz 67 68 Fizz Buzz 71 Fizz 73 74 FizzBuzz 76 77 Fizz 79 Buzz Fizz 82 83 Fizz Buzz 86 Fizz 88 89 FizzBuzz 91 92 Fizz 94 Buzz Fizz 97 98 Fizz Buzz
```

## Stage - 2 
* A number is `Fizz` if it is divisible by `3` and contains `3`, overriding any existing behaviour
* A number is `Buzz` if it is divisible by `5` and contains `5`, overriding any existing behaviour
* A number is `FizBuzz` if it satisfy above 2 criterias together, overriding any existing behaviour

### Example Stage - 2

Running the program over a range from 1 - 100  one should get the following output:

```
1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz Fizz 14 FizzBuzz 16 17 Fizz 19 Buzz Fizz 22 Fizz Fizz Buzz 26 Fizz 28 29 FizzBuzz Fizz Fizz Fizz Fizz FizzBuzz Fizz Fizz Fizz Fizz Buzz 41 Fizz Fizz 44 FizzBuzz 46 47 Fizz 49 Buzz FizzBuzz Buzz FizzBuzz FizzBuzz Buzz Buzz FizzBuzz Buzz Buzz FizzBuzz 61 62 Fizz 64 Buzz Fizz 67 68 Fizz Buzz 71 Fizz Fizz 74 FizzBuzz 76 77 Fizz 79 Buzz Fizz 82 Fizz Fizz Buzz 86 Fizz 88 89 FizzBuzz 91 92 Fizz 94 Buzz Fizz 97 98 Fizz Buzz

```

## Run

```
mvn clean test exec:java
```
