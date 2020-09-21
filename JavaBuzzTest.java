import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class JavaBuzzTest {
    @Test
    public void returnsFizz() {
        JavaBuzz javabuzz = new JavaBuzz();
        int result = javabuzz.fizzbuzz(3);
        assertEquals("Fizz", result);
    }
}