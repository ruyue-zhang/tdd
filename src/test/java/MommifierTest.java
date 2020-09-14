import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MommifierTest {
    @Test
    void should_throw_input_exception_when_input_null() {
        assertThrows(InputException.class, () -> {
            Mommifier mommifier = new Mommifier();
            mommifier.addMommy(null);
        });
    }

    @Test
    void should_return_itself_when_input_not_include_vowels() throws InputException {
        Mommifier mommifier = new Mommifier();
        String input = "try";
        String result = mommifier.addMommy(input);
        assertEquals("try", result);
    }

    @Test
    void should_return_itself_when_vowels_less_than_30_percent() throws InputException {
        Mommifier mommifier = new Mommifier();
        String input = "mommy";
        String result = mommifier.addMommy(input);
        assertEquals("mommy", result);
    }
}
