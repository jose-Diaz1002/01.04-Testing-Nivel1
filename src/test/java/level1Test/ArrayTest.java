package level1Test;

import level1.Array;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArrayTest {
    @Test
    public void testArrayNumbersError() {
        Array objet = new Array();
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            objet.arrayNumbers(7);
        });
    }
}
