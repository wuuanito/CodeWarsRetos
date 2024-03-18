
public class SquareDigit {

    public int squareDigits(int n) {
        StringBuilder newNumber = new StringBuilder();

        while (n != 0) {
            int digit = n % 10;
            int squared = digit * digit;

            newNumber.append(squared); // Insertar al final de la cadena
            n = n / 10;
        }

       

        // Verificar si la cadena está vacía antes de convertirla a un número
        String numberString = newNumber.toString();
        if (numberString.isEmpty()) {
            return 0; // o cualquier otro valor predeterminado
        } else {
            return Integer.parseInt(numberString);
        }
    }
}