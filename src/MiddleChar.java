public class MiddleChar {
    public static void main(String[] args) {
        String word = "whatever";
        System.out.println("Middle Char(s) = " + getMiddle(word));
    }

    private static String getMiddle(String word) {
        int cantidadLetras = word.length();
        String resultado;

        char char1 = 0;
        char char2 = 0;

        if (esPar(cantidadLetras)) {
            int cantidadMitad = cantidadLetras / 2;
            char1 = word.charAt(cantidadMitad - 1);
            char2 = word.charAt(cantidadMitad);
            resultado = Character.toString(char1) + Character.toString(char2);
        } else {
            int cantidadMitad = cantidadLetras / 2;
            char1 = word.charAt(cantidadMitad);
            resultado = Character.toString(char1);
        }
        return resultado;
    }

    public static boolean esPar(int numero) {
        if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
