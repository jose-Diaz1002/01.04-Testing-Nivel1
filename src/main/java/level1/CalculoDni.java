package level1;
/*
Crea una clase llamada CalculoDni que calcule la letra del DNI al recibir
el número como parámetro.
Crea una clase jUnit que verifique su correcto funcionamiento, parametrizándola
para que el test reciba un espectro de datos amplio y valide si el cálculo es correcto
para 10 números de DNI predefinidos.
 */

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

    public static void main(String[] args) {

        char letra = dniCalculation(6301547);
        System.out.println("El DNI completo es: " + letra);
    }
}
