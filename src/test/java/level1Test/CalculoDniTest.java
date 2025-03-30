package level1Test;

import level1.CalculoDni;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculoDniTest {


    @Test
    public void testDniCalculation(){
        //Given
        CalculoDni dinLetter = new CalculoDni();
        //When
        char letterCalculation = dinLetter.dniCalculation(6301547);
        char letter= 'F';
        //Then
        assertEquals(letter,letterCalculation);
    }
}
