package level1;

public class CalculoDni {

    public static char dniCalculation(int number){
        final int divisorNumber = 23;
        int restDivision = number % divisorNumber;

        char[] letters = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D',
                'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L',
                'C', 'K', 'E'};
        char letter = letters[restDivision];
        return letter;
   }
}
