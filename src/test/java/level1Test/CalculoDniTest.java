package level1Test;

import level1.CalculoDni;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculoDniTest {
    @ParameterizedTest
    @CsvSource({
            "12345678, 'Z'",
            "87654321, 'X'",
            "11222333, 'N'",
            "44555666, 'C'",
            "99999999, 'R'",
            "00000000, 'T'",
            "11111111, 'H'",
            "22222222, 'J'",
            "33333333, 'P'",
    })
    public void testDniCalculation(int dni, char letter){
        char letterCalculation = CalculoDni.dniCalculation(dni);
        assertEquals(letter,letterCalculation);
    }
}
