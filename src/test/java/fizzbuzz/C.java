package fizzbuzz;

import org.junit.Test;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static org.assertj.core.api.Assertions.assertThat;

public class C {

    private Fizzbuzz fizzbuzz = new Fizzbuzz();

    @Test
    public void should_produce_4() {
        // given
        var input = randomFrom(3, 4, 5);
        // when
        String result = fizzbuzz.fizzbuzz(input);
        // then
        assertThat(result).isEqualTo("4");
    }

    private <T> T randomFrom(T... values) {
        List<T> list = List.of(values);
        return list.get(ThreadLocalRandom.current().nextInt(0, list.size()));
    }

}
