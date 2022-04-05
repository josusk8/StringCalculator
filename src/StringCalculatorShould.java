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

    @Test
    void return_numbers_or_sum() {

        assertEquals(1, StringCalculator.calculate("1"));
        assertEquals(2, StringCalculator.calculate("1,1"));
    }

    @Test
    void handle_entry_empty() {

        assertEquals(0, StringCalculator.calculate(""));


    }

    @Test
    void handle_entry_non_numbers() {
        assertEquals(0, StringCalculator.calculate("C"));

    }

    @Test
    void handle_entry_whith_jumps_lines() {
        assertEquals(6, StringCalculator.calculate("1\n2,3"));
        assertEquals(7, StringCalculator.calculate("1\n2,3\n1"));
    }


    @Test
    void define_delimiter_on_entry() {
        assertEquals(3, StringCalculator.calculate("//;\n1;2"));

    }

}
