import java.util.*;

public class TestPruebasObregon {
    public static void main(String[] args) {


//        System.out.println(misterio(2, 4));

        //Variables de prueba
//        int[] arreglo1 = new int[]{3, 1, 2, 3, 3, 5, 4};
//        int[] arreglo2 = new int[]{5, 4, 2, 1, 0, -5, -6};//Mayor a menor
//        int[] arreglo3 = new int[]{-10, -3, 2, 3, 4, 7, 10};//Menor a mayor
//        int[] arreglo4 = new int[]{3, 1, 2, 3, 3, 5, 4};//Sin orden
//        int[] arreglo5 = new int[]{5, 5, 5, 5, 5};//Todos iguales
//        int numeroPerfecto = 6;
//        String cadena = "menem";
//        String texto = "No hay 2 otro capitan mas valiente 2 que tu... 2";
//
//        System.out.println(describirArreglo(arreglo1));
//        System.out.println(describirArreglo(arreglo2));
//        System.out.println(describirArreglo(arreglo3));
//        System.out.println(describirArreglo(arreglo5));


//        mayorAmenor(arreglo1);

//        System.out.println("\nArreglo ordenado de mayor a menor:");
//        for (int i = 0; i < arreglo1.length; i++) {
//            System.out.print(arreglo1[i] + " ");
//        }

//        determinarOrden(arreglo4);

//        numeroPerfecto(numeroPerfecto);

//        palindromo(cadena);

//        composicionCadena(texto);
    }

    public static int misterio(int uno, int dos) {
        int calculo = 1;
        for (int x = 0; x < dos; x++) {
            System.out.println(calculo + " * " + uno);
            calculo *= uno;
            System.out.println("Resultado = " + calculo);
        }
        return calculo;
    }

    private static String describirArreglo(int[] arreglo) {
        boolean ascendiente = true;
        boolean descendiente = true;

        for (int i = 0; i < arreglo.length - 1 && (ascendiente || descendiente); i++) {
            if (arreglo[i] > arreglo[i + 1]) ascendiente = false; //Arreglo de Mayor a menor, entonces no es ascendiente
            if (arreglo[i] < arreglo[i + 1])
                descendiente = false;//Arreglo de Menor a mayor, entonces no es descendiente
        }

        if (ascendiente && descendiente) {
            return "Arreglo con numeros iguales.";
        }
        if (ascendiente) return "Arreglo ascendiente.";
        if (descendiente) return "Arreglo descendiente.";

        return "Arreglo desordenado";
    }

    private static void composicionCadena(String texto) {

        texto = texto.toUpperCase(Locale.ROOT);
        String[] cadenaOriginal = texto.split("");
        System.out.println("Texto original: \n" + texto);
        String[] cadenaLimpia = eliminarLetrasRepetidas(texto.split(""));

        System.out.println("\nCadena Limpia. Caracteres que componen el texto:");
        for (int i = 0; i < cadenaLimpia.length; i++) {
            System.out.print(cadenaLimpia[i] + "");
        }

        System.out.println("\n");
        for (int i = 0; i < cadenaLimpia.length; i++) {
            int contador = 0;
            for (int j = 0; j < cadenaOriginal.length; j++) {
                if (cadenaLimpia[i].equals(cadenaOriginal[j]) && !cadenaLimpia[i].equals(" ")) {
                    contador++;
                }
            }
            if (contador != 0)
                System.out.println("El caracter " + cadenaLimpia[i] + " aparece " + contador + " veces.");
        }
    }

    private static String[] eliminarLetrasRepetidas(String[] cadenaALimpiar) {
        for (int i = 0; i < cadenaALimpiar.length; i++) {
            for (int j = i + 1; j < cadenaALimpiar.length; j++) {
                if (cadenaALimpiar[i].equals(cadenaALimpiar[j])) {
                    cadenaALimpiar[j] = " ";
                }
            }
        }
        return cadenaALimpiar;
    }


    private static void palindromo(String cadena) {
        System.out.println("Cadena original: " + cadena);
        String reverse = String.valueOf(new StringBuilder(cadena).reverse());
        System.out.println("Cadena invertida: " + reverse);
        if (cadena.equals(reverse)) {
            System.out.println("Es palindromo.");
        } else System.out.println("No es palindromo.");
    }

    private static void numeroPerfecto(int numeroPerfecto) {

        int contador = 0;
        int sumador = 0;
        System.out.print("Divisores: ");
        for (int i = 1; i < numeroPerfecto - 1; i++) {
            if (numeroPerfecto % i == 0) {
                contador++;
                sumador += i;
                System.out.print(i + " ");
            }
        }
        System.out.println("\nEl numero " + numeroPerfecto + " tiene " + contador + " divisores");
        if (sumador == numeroPerfecto)
            System.out.println("El numero " + numeroPerfecto + " es un numero perfecto");
        else System.out.println("El numero " + numeroPerfecto + " NO es perfecto");
    }

    //Metodo 1. Orden de mayor a menor
    private static int[] mayorAmenor(int[] arreglo) {
        System.out.println("Arreglo original:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[i] < arreglo[j]) {
                    int aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;
                }
            }
        }
        return arreglo;
    }

    //Metodo 2. Determinar orden: menor a mayor, mayor a menor o desordenado
    private static void determinarOrden(int[] arreglo) {
        int contador = arreglo.length;
        int contador2 = 1;

        System.out.println("\n\nArreglo original:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }

        for (int i = 0; i < arreglo.length - 1; i++) {
            if (arreglo[i] > arreglo[i + 1]) {
                contador2++;
            }
        }

        for (int i = 0; i < arreglo.length - 1; i++) {
            if (arreglo[i] < arreglo[i + 1]) {
                contador2++;
            }
        }

        if (contador == contador2 && arreglo[0] > arreglo[arreglo.length - 1]) {
            System.out.println("\n\nArreglo ordenado de mayor a menor");
        } else if (contador == contador2 && arreglo[0] < arreglo[arreglo.length - 1]) {
            System.out.println("\n\nArreglo ordenado de menor a mayor");
        } else System.out.println("\n\nArreglo sin un orden especifico");
    }
}
