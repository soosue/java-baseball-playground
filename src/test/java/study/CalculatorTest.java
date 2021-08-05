package study;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {

    Calculator cal = new Calculator();

    @Test
    void additionTest() {
        String value = "2 + 3";
        assertThat(cal.calculate(value))
                .isEqualTo(5);
    }

    @Test
    void subtractionTest() {
        String value = "2 - 3";
        assertThat(cal.calculate(value))
                .isEqualTo(-1);
    }

    @Test
    void multiplicationTest() {
        String value = "5 * 4";
        assertThat(cal.calculate(value))
                .isEqualTo(20);
    }

    @Test
    void divisionTest() {
        String value = "20 / 2";
        assertThat(cal.calculate(value))
                .isEqualTo(10);
    }

    @Test
    void totTest() {
        String value = "2 + 3 * 4 / 2";
        assertThat(cal.calculate(value))
                .isEqualTo(10);
    }
}
