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

    @Test
    void should_return_itself_when_vowels_more_than_30_percent_but_no_repeat() throws InputException {
        Mommifier mommifier = new Mommifier();
        String input = "rename";
        String result = mommifier.addMommy(input);
        assertEquals("rename", result);
    }

    @Test
    void should_insert_mommy_when_vowels_more_than_30_percent_and_repeat() throws InputException {
        Mommifier mommifier = new Mommifier();
        String input = "zooom";
        String result = mommifier.addMommy(input);
        assertEquals("zomommyomommyom", result);
    }
}
