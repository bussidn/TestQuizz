package fizzbuzz;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class A {

    Fizzbuzz fizzbuzz = new Fizzbuzz();

    @Test
    public void seven_should_return_7() {
        // given
        var input = Dao.getValueFromId(7);
        // when
        var result = fizzbuzz.fizzbuzz(input);
        // then
        assertThat(result).isEqualTo("7");
    }

}
























