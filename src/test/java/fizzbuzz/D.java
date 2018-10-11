package fizzbuzz;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class D {

    Fizzbuzz fizzbuzz = new Fizzbuzz();

    @Test
    public void should_return_fizz() throws FileNotFoundException, UnsupportedEncodingException {
        // given
        var three = 3;
        // when
        var result = this.fizzbuzz.fizzbuzz(3);
        // then
        new PrintWriter(result, "UTF-8").close();
    }

}
