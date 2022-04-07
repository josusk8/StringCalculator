import org.junit.jupiter.api.Test;

import static java.lang.Long.sum;
import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 *TO-DO List
 *
 * Input 1 -> 1
 * Input 1,2 -> 3
 * Input "" -> 0
 *
 */


public class StringCalculatorShould {
    StringCalculator stringCalculator = new StringCalculator();

    @Test
    void when_have_one_number_return_the_same() {

        assertEquals(1, stringCalculator.sum("1"));
        assertEquals(2, stringCalculator.sum("2"));
    }

    @Test
    void when_empty_return_0(){
        assertEquals(0, stringCalculator.sum(""));
    }

    @Test
    void when_have_more_than_one_element_return_sum(){
        assertEquals(3, stringCalculator.sum("1,2"));
        assertEquals(6, stringCalculator.sum("1,2,3"));
    }

    @Test
    void when_have_more_than_one_element_with_brake_line_return_sum(){
        assertEquals(6, stringCalculator.sum("1,2\n3"));
    }

    @Test
    void if_delimiter_is_specified_change_delimiter(){
        assertEquals(6, stringCalculator.sum("//;\n1;2;3"));
    }

    @Test
    void when_numbers_are_negative_throw_exception(){

    }




}
