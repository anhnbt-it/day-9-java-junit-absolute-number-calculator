import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/15/2020
 * Time: 10:49 AM
 */
public class AbsoluteNumberCalculatorTest {
    @Test
    @DisplayName("0")
    void absNumber0() {
        int number = 0; // Chứa giá trị nhập vào
        int expected = 0; // Chứa giá trị mong muốn
        int actual = AbsoluteNumberCalculator.findAbsolute(number); // Chứa giá trị thực thế

        assertEquals(expected, actual); // So sánh giá trị thực thế và giá trị mong muốn
    }

    @Test
    @DisplayName("1")
    void absNumber1() {
        int number = 1;
        int expected = 1;
        int actual = AbsoluteNumberCalculator.findAbsolute(number);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("-5")
    void absNumber5() {
        int number = -5;
        int expected = 5;
        int actual = AbsoluteNumberCalculator.findAbsolute(number);

        assertEquals(expected, actual);
    }
}
