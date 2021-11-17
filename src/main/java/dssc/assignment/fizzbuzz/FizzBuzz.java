package dssc.assignment.fizzbuzz;

public class FizzBuzz {

    public String convert(int number) {
        return String.valueOf(number);
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
