package fizzbuzz;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class B1 {

    private static String value = "";
    private Fizzbuzz fizzbuzz = new Fizzbuzz();

    @Test
    public void three_should_return_fizz() {
        // given
        var three = 3;
        // when
        value += this.fizzbuzz.fizzbuzz(three);
        // then
        assertThat(value).isEqualToIgnoringCase("fizz");
    }

    @Test
    public void five_should_return_buzz() {
        // given
        var three = 5;
        // when
        value += this.fizzbuzz.fizzbuzz(three);
        // then
        assertThat(value).isEqualToIgnoringCase("buzz");
    }

}
