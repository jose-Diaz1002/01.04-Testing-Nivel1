package level1;

public class Array {

    public void arrayNumbers(int indice) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers[indice]);
    }

    public static void main(String[] args) {
        Array ob = new Array();
        ob.arrayNumbers(7);
    }
}


