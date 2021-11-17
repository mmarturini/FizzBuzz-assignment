package dssc.assignment.fizzbuzz;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FizzBuzz {

    public String convert(int number) {

        if ( number%15 ==0 ) {
            return "FizzBuzz";
        }
        if ( number%5 == 0 ) {
            return "Buzz";
        }
        if ( number%3 == 0 ) {
            return "Fizz";
        }
        else {
            return String.valueOf(number);
        }
    }

    public void print() {
        Stream<String> fizzBuzzes = IntStream.range(1, 101).mapToObj(this::convert);
        System.out.println(fizzBuzzes.collect(Collectors.joining(", ")));
    }

    public static void main(String... args) {

        String aux;
        for (int i=0; i < 106; i++) {

            if ( i%3 == 0) {
               if ( i%5 == 0) {
                   if ( i%7 == 0) {
                       aux = "FizzBuzzBang";
                   }
                   else {
                       aux = "FizzBuzz";
                   }
               }
               else {
                   aux = "Fizz";
               }
           }
           else if ( i%5 == 0) {
               if ( i%7 == 0) {
                   aux = "BuzzBang";
               }
               else {
                   aux = "Buzz";
               }
           }
           else if ( i%7 == 0) {
               aux = "Bang";
           }
           else {
               aux = String.valueOf(i);
           }

            System.out.println(aux);
        }
        
    }

}
