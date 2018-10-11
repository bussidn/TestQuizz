package fizzbuzz;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class E {

    Fizzbuzz fizzbuzz = new Fizzbuzz();

    @Test
    public void not_so_thorough_test() {
        // given
        var thorough = new Integer[] {3, 4, 5};
        // when
        var result = fizzbuzz.fizzbuzz(thorough);
        // then
        assertThat(result).isEqualTo(new String[]{"fizz", "4", "buzz"});
    }

    @Test
    public void four_should_return_4() {
        // given
        var four = 4;
        // when
        var result = fizzbuzz.fizzbuzz(four);
        // then
        assertThat(result).isEqualTo("4");
    }

    @Test
    public void three_should_return_fizz() {
        // given
        var three = 3;
        // when
        var result = fizzbuzz.fizzbuzz(three);
        // then
        assertThat(result).isEqualTo("fizz");
    }

    @Test
    public void five_should_return_buzz() {
        // given
        var five = 5;
        // when
        var result = fizzbuzz.fizzbuzz(five);
        // then
        assertThat(result).isEqualTo("buzz");
    }

}
