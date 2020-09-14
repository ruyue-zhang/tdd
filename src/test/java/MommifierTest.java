import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MommifierTest {
    @Test
    void should_throw_input_exception_when_input_null() {
        assertThrows(InputException.class, () -> {
            Mommifier mommifier = new Mommifier();
            mommifier.addMommy(null);
        });
    }
}
