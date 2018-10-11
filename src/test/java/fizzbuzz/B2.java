package fizzbuzz;

import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class B2 {

    Fizzbuzz fizzbuzz = new Fizzbuzz();

    @Test
    public void three_first_integers() {
        // given
        Integer[] input = getInputs();
        // when
        String[] result = fizzbuzz.fizzbuzz(input);
        // then
        assertThat(result).isEqualTo(new String[]{ "1", "2", "fizz" });
    }

    private Integer[] getInputs() {
        Path filePath = Paths.get(System.getenv("FILE_PATH"));
        try(Stream<String> s = Files.lines(filePath)) {
            return new Integer[]{1, 2, 3};
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
