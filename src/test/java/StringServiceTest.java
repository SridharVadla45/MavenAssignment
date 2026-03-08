import com.smu.mscda.StringService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringServiceTest {

    private final StringService service = new StringService();

    @Test
    void shouldCapitalizeLowercaseString() {
        assertEquals("Hello", service.capitalizeInput("hello"));
    }

    @Test
    void shouldGenerateMd5HexForInputString() {
        assertEquals("5d41402abc4b2a76b9719d911017c592", service.generateMd5Hex("hello"));
    }
}