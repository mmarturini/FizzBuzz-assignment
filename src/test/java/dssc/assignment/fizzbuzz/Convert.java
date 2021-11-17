package dssc.assignment.fizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Convert {

    private final FizzBuzz fizzBuzz = new FizzBuzz();
 /*
    @Test
    void number_1_is_1() {
        int one = 1;

        String result = fizzBuzz.convert(one);

        //2 args: first arg is expected value, second arg is actual value
        Assertions.assertEquals("1", result);
    }

    @Test
    void number_2_is_2() {
        int two = 2;

        String result = fizzBuzz.convert(two);

        Assertions.assertEquals("2", result);
    }

    @Test
    void number_40() {
        Assertions.assertEquals("40", fizzBuzz.convert(40));
    }
  */

    // Parametrized tests make it possible to run same tests
    // with multiple arguments
    @ParameterizedTest
    @CsvSource({"1, 1", "2, 2", "40, 40"})
    void numbers_not_divisible_by_3_or_5_to_Strings(String expected, int number) {
        Assertions.assertEquals(expected, fizzBuzz.convert(number));
    }
    // we need to pass to this test the expected string and the number
    // to pass to the convert method, to provide args to the param test we use the annotation
    // CsvSource
    // we have 3 pairs of arguments to run the test in CsvSource, and j unit
    // is using the first of the pair as string and the second as int to pass as arg to the test
}


