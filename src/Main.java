import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        String comparar = "hgwerlluioqweorjhlsdfllld";

        String helloworld = "helloworld";

        int contarLetras = helloworld.length();

        String[] array1 = helloworld.split("");
        String[] array2 = comparar.split("");

        ArrayList<String> resultado = new ArrayList<>();

        int contador = 0;

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i].equals(array2[j])) {
                    contador++;
                    resultado.add(array2[j]);
                }
            }
        }



        //ELIMINO CARACTERES REPETIDOS DE UN ARRAYLIST
        //lo paso a una coleccion de tipo Set porque los Set no admiten repetidos y luego lo paso a ArrayList de nuevo

//        Set<String> hs = new HashSet<>();
//        hs.addAll(resultado);
//        resultado.clear();
//        resultado.addAll(hs);


        System.out.println("resultado = " + resultado);



        String resultadoFinal = String.join("", resultado);

        System.out.println("resultadoFinal ORIGINAL= " + resultadoFinal);

        //resultadoFinal = resultadoFinal.replaceAll("\\\\d+(?:[.,]\\\\d+)?|helloworld", "$1"); //(.*)(?=.*\1)

        System.out.println("resultadoFinal MODIFICADO= " + resultadoFinal);



//        String cadena = "ffeeddaa";
//        System.out.println ("Original: " + cadena);
//        cadena = cadena.replaceAll("(.)\\1", "$1");
//        System.out.println ("Resultado: " + cadena);







//        String resultadoFinal1 = resultado.toString();
//        String resultadoFinal2 = resultado.toString();
//
//        resultadoFinal.replaceAll("(.)\\1", "$1");



//        for (int i = 0; i < resultado.size(); i++) {
//            for (int j = i + 1; j < resultado.size(); j++) {
//                if (resultado.indexOf(j) == (resultado.indexOf(i))) {
//                    resultado.remove(j);
//                }
//            }
//        }


        if (contador >= contarLetras) {
            System.out.println("La cadena contiene las letras necesarias");
        } else {
            System.out.println("La cadena no contiene las letras suficientes");
        }


    }

//    static boolean scramble(String uno) {
//
//        int contador = 0;
//
//        String helloworld = "helloworld";
//        String[] helloworldSeparado = helloworld.split("");//helloworld en un vector
//
//
//
//        String[] unoSeparado = uno.split("");
//
//        ArrayList<String> resultado = new ArrayList<>();
//
//        for (int i = 0; i < helloworldSeparado.length; i++) {
//            for (int j = 0; j < unoSeparado.length; j++) {
//                if (helloworldSeparado[i] == unoSeparado[j]) {
//                    contador++;
//                    resultado.add(unoSeparado[j]);
//                }
//            }
//        }
//
//        System.out.println("resultado = " + resultado);
//
//        if (helloworld == resultado.toString()) {
//            System.out.println("true");
//            return true;
//        } else {
//            System.out.println("false");
//            return false;
//        }
//    }

}
